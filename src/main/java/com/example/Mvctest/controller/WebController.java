package com.example.Mvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @GetMapping("/home")
    public String index() {
        return "index.html";
    }
    @GetMapping("/login")
    public String login() {return "login.html";}
}