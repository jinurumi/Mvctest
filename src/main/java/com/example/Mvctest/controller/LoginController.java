package com.example.Mvctest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    //전달받은 요청을 LoginService 로 전달하고 서비스에서 로직을 수행한다

    //API로 유저정보를 전달받음



    //Api 규격 맞추기









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