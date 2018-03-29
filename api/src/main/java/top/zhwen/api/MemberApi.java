package top.zhwen.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.zhwen.entity.Member;
import top.zhwen.interceptor.Permission;
import top.zhwen.service.MemberService;

import java.util.List;

/**
 * Created by Zhw on 2018/3/21.
 */
@RestController
@RequestMapping("/member")
public class MemberApi {
    @Autowired
    private MemberService memberService;

    @GetMapping("")
    @Permission
    public List<Member> getMember(String token) {
        return memberService.getMember();
    }

    @PostMapping("")
    @Permission
    public String addPost(Member member,String token) {
        return "success "+token;
    }

    @GetMapping("/{id}")
    @Permission
    public Member getMember(@PathVariable Long id,String token) {
        return memberService.getMember(id);
    }

    @PutMapping("/{id}")
    @Permission
    public String uppMember(@PathVariable Long id,String token) {
        return "success";
    }

    @PatchMapping("/{id}")
    @Permission
    public String uppMemberPart(@PathVariable Long id,String token) {
        return "success";
    }

    @DeleteMapping("/{id}")
    @Permission
    public String delMember(@PathVariable Long id,String token) {
        return "success";
    }
}
