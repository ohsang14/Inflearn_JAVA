package com.example.firstproject1.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class MemberForm {
    private String email;
    private String password;

    public Member toEntity(){
        return new Member(null,email,password);
    }
}
