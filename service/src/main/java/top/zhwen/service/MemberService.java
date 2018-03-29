package top.zhwen.service;

import top.zhwen.entity.Member;

import java.util.List;

/**
 * Created by Zhw on 2018/3/21.
 */

public interface MemberService {
     List<Member> getMember();
     Member getMember(Long id);
}
