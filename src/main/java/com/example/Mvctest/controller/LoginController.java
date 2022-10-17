package com.example.Mvctest.controller;

import com.example.Mvctest.User;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
public class LoginController {

    @PostMapping(value = "/login", produces = "application/json")
    public String login(@RequestBody User user, Model model) {
        System.out.println("user" + user);
        User user1 = new User("jinwoo", "29");
        User user2 = new User("jinhye", "25");
        System.out.println(user.getName());
        if(user.getName().equals(user1.getName()) || user.getName().equals(user2.getName())){
            model.addAttribute("name", user.getName());
        }
        else{
            model.addAttribute("name", "unknown");
        }
        return "200";
    }
}