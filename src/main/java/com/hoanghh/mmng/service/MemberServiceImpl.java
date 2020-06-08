package com.hoanghh.mmng.service;

import com.hoanghh.mmng.entity.Member;
import com.hoanghh.mmng.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public String getMember(long id) {
        Member member = memberRepository.findById(id);
        return member.toString();
    }

    @Override
    public Member createMember(Member member) {
        if (verifyMember(member)) {
            return memberRepository.save(member);
        } else {
            return new Member();
        }
    }

    private boolean verifyMember(Member member) {
        return true;
    }
}
