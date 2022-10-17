package com.example.Mvctest.controller;

import com.example.Mvctest.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin(origins = "<http://localhost:8877>")
@RestController
@RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
public class LoginController {

    @GetMapping(value = "/login", produces = "application/json")
    public String login(@RequestBody User user, Model model) {
        System.out.println("user" + user);
        User user1 = new User("jinwoo", "29");
        User user2 = new User("jinhye", "25");
        System.out.println(user.getName());
        String result = "";
        if(user.getName().equals(user1.getName()) || user.getName().equals(user2.getName())){
            model.addAttribute("name", user.getName());
            result = "success";
        }
        else{
            model.addAttribute("name", "unknown");
            result = "fail";
        }
        return result;
    }
}