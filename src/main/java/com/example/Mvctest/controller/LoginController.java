package com.example.Mvctest.controller;
import com.example.Mvctest.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import static com.example.Mvctest.service.LoginService.result;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
@RequestMapping("/")
public class LoginController {

    //API로 유저정보를 전달받음
    @PostMapping("/login")
    public User postMethod(@RequestBody User user) {
        return user;
    }



    //login 페이지에는 이름, 나이/입력칸 두개. 입력완료 버튼.을 누르면 없는
    //사용자면 alert("없습니다.")

    @GetMapping("/login")
    public String nowlogin() {
        if (result.equals("ID errer")) {
            return "존재하지 않는 아이디입니다.";
        }
        return null;
    }







}


    //Api 규격 맞추기












