package com.hoanghh.mmng;

import com.hoanghh.mmng.entity.Member;
import com.hoanghh.mmng.repository.MemberRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private MemberRepository memberRepository;

    public DevBootstrap(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Member test = new Member();
        test.setFullname("Fullname");
        test.setAlias("Alias");
        test.setRefId(0L);
        test.setGender("Male");
        System.out.println(memberRepository.save(test));

        Member test2 = new Member();
        test2.setFullname("Fullname2");
        test2.setAlias("Alias2");
        test2.setRefId(0L);
        test2.setGender("Male2");


        System.out.println(memberRepository.save(test2));
    }
}
