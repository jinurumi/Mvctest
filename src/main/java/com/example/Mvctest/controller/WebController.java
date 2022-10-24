package com.example.Mvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    //회원가입
    @GetMapping("/users/new")
    public String createForm() {
        return "Users/createUserForm";
    }

    //회원리스트
    @GetMapping("/users/list")
    public String userList(){
        return "userList";
    }

    //로그인
    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }






}



