package com.example.firstproject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username","오박사님!");
        return "greetings";
    }
    @GetMapping("/by")
    public String SeeYouNext(Model model){
        model.addAttribute("nickname","김보니");
        return "goodbye";
    }
}
