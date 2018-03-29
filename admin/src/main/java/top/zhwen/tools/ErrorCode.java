package top.zhwen.tools;


public enum ErrorCode {
    /**
     * 系统错误信息
     * */
    OK(200, "success", "成功"),
    PERMISSION_DENIED(400, "Permission denied", "没有权限"),
    SYSTEM_ERR(400, "System is busy", "系统繁忙"),
    INVALID_CLIENTID(400, "Invalid clientid", "无效的clientid"),
    INVALID_PASSWORD(400, "User name or password is incorrect", "用户名或密码不正确"),
    INVALID_CAPTCHA(400, "Invalid captcha or captcha overdue", "无效的验证码或验证码过期"),
    INVALID_TOKEN(400, "Invalid token", "无效token");
    // 成员变量
    private int httpStatus;
    private String code;
    private String message;
    private int res_code;

    // 构造方法
    private ErrorCode(int httpStatus, String code, String message) {
        this.setHttpStatus(200);
        this.setRes_code(httpStatus);
        this.setCode(code);
        this.setMessage(message);
    }

    private ErrorCode() {
        this.setHttpStatus(httpStatus);
        this.setCode(code);
        this.setMessage(message);
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRes_code() {
        return res_code;
    }

    public void setRes_code(int res_code) {
        this.res_code = res_code;
    }

}
