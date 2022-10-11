package com.example.Mvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {

    //GetMapping으로 리다이렉트 기능만 수행
    @GetMapping("/")
    public String indexView() {
        return "redirect:/index";
    }



}
