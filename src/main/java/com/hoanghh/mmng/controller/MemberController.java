package com.hoanghh.mmng.controller;

import com.hoanghh.mmng.entity.Member;
import com.hoanghh.mmng.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/members")
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity getMember(@PathVariable("id") long id){
        return new ResponseEntity<>(memberService.getMember(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/")
    public ResponseEntity addMember(@RequestBody Member member){
        Member result = memberService.createMember(member);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
