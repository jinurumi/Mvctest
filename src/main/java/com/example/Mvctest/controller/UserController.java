package com.example.Mvctest.controller;
import com.example.Mvctest.model.User;
import com.example.Mvctest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller

@RequestMapping("/")
public class UserController {

    private UserService userService;

    @Autowired //이거말고 다른거 써야됨
    public UserController(UserService userService) {
        this.userService=userService;
    }
    //회원가입
    @PostMapping("/users/new")
    public String create(User userform){
        User user = new User();
        user.setName(userform.getName());
        user.setAge(userform.getAge());

        userService.join(user);
        return "redirect:/";
    }

    //회원리스트
    @GetMapping("/users")
    public String list(Model model) {
        List<User> users = userService.findUsers();
        model.addAttribute("users", users);
        return "users/userList";
    }

    //로그인
    @PostMapping("/login")
    public User postMethod(@RequestBody User user) {
        return user;
    }



    //login 페이지에는 이름, 나이/입력칸 두개. 입력완료 버튼.을 누르면 없는
    //사용자면 alert("없습니다.")


    //로그인 성공하면 이름띄우기


    @GetMapping("user-api")
    @ResponseBody //http의 body에 문자내용을 직접 반환
    public User userapi(@RequestParam("name") String name, Integer age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }




}












