package com.hoanghh.mmng.service;

import com.hoanghh.mmng.entity.Member;

public interface MemberService {

    String getMember(long id);
    Member createMember(Member member);
}
