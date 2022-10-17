package com.example.Mvctest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.example.Mvctest.service.LoginService.result;


@Controller
public class WebController {



    //GetMapping으로 리다이렉트 기능만 수행
    @GetMapping("/index")
    public String indexView() {
        if(result.equals("success")){
            return "redirect:/"; }
        else{
            return "/index";
        }
    }

    @GetMapping("/login")
    public String loginView() {
        if(result.equals("ID error")){
            return "/login";
        } else if (result.equals("success")) {
            return "redirect:/";
        }
        else {
            return "redirect:/";
        }
    }




    /* index 페이지에서 로그인하기 성공했으면 홈 화면으로 리다이렉트해서 홈화면에
     로그인한 사용자 이름 띄우기
       login 페이지에는 이름, 나이/입력칸 두개. 입력완료 버튼.을 누르면 없는
        사용자면 alert("없습니다.") 있는 사용자면 홈화면으로 리다이렉트 */





}



