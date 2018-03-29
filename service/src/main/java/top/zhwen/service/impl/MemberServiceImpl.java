package top.zhwen.service.impl;

import top.zhwen.entity.Member;
import top.zhwen.service.MemberService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Zhw on 2018/3/21.
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Override
    public List<Member> getMember() {
        List<Member> members=new ArrayList<>();
        for(long i=0;i<10;i++){
            Member member=new Member();
            member.setAge(i);
            member.setCreateTime(new Date());
            member.setEmail("66666@gmail.com");
            member.setId(i);
            member.setLoginName("admin"+i);
            member.setNickName("nickname"+i);
            member.setPhoneNumber("1333333333"+i);
            members.add(member);
        }
        return members;
    }

    @Override
    public Member getMember(Long id) {
        Member member=new Member();
        member.setAge(id);
        member.setCreateTime(new Date());
        member.setEmail("66666@gmail.com");
        member.setId(id);
        member.setLoginName("admin"+id);
        member.setNickName("nickname"+id);
        member.setPhoneNumber("1333333333"+id);
        return member;
    }
}
