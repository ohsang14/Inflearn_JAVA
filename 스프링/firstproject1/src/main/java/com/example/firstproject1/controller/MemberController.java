package com.example.firstproject1.controller;

import com.example.firstproject1.dto.MemberForm;
import com.example.firstproject1.entity.Member;
import com.example.firstproject1.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class MemberController {
    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/signup")
    public String signUpPage(){
        return "members/new";
    }
    @PostMapping("/join")
    public String join(MemberForm memberForm){
        System.out.println(memberForm.toString());
        Member member = memberForm.toString();
        System.out.println(member.toString());
        Member saved = memberRepository.save(member);
        System.out.println(saved.toString());
        return "";
    }
}
