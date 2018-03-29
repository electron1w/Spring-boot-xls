package top.zhwen.interceptor;

import top.zhwen.utils.ErrorCode;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;

/**
 * Created by Zhw on 2018/3/21.
 */
@Aspect
@Component
public class TokenInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(TokenInterceptor.class);
    @Value("${spring.profiles}")
    private String env;

    @Pointcut("(execution(* top.zhwen.api..*(..)))")
    public void controllerMethodPointcut() {
    }

    /**
     * 拦截器具体实现
     *
     * @param pjp
     * @return ErrorCode
     */
    @Around("controllerMethodPointcut()")
    @ResponseBody
    public Object interceptor(ProceedingJoinPoint pjp) {
        long beginTime = System.currentTimeMillis();
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod(); //拦截的方法
        String methodName = method.getName(); //被拦截的方法名
        logger.info("请求开始，方法：{}", methodName);
        Object result = null;
        if (isLoginRequired(method)) {
            Object[] args = pjp.getArgs();
            String[] strings = signature.getParameterNames();
            String token=null;
            for (int i = 0; i < strings.length; i++) {
                if ("token".equals(strings[i])) {
                    token=(String)args[i];
                }
            }
            if (isLogin(token)) {
                result="12313";
            }
        }
        try {
            if (result == null) {
                result = pjp.proceed();
            }
        } catch (Throwable e) {
            logger.info("exception: ", e);
        }
        if (result instanceof ErrorCode) {
            long costMs = System.currentTimeMillis() - beginTime;
            logger.info("{}请求结束，耗时：{}ms", methodName, costMs);
        }
        return result;
    }

    /**
     * 判断一个方法是否需要登录
     *
     * @param method
     * @return
     */
    private boolean isLoginRequired(Method method) {
        if (!"prod".equals(env)) { //只有生产环境才需要登录
            return false;
        }
        boolean result = false;
        if(method.isAnnotationPresent(Permission.class)){
            result = method.getAnnotation(Permission.class).loginReqired();
        }
        return result;
    }


    private boolean isLogin(String token) {
        return true;
       //TOOD 登录验证,判断是否已经登录
    }
}
