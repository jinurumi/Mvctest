package com.example.Mvctest.service;
import com.example.Mvctest.model.User;

import java.util.*;

public class LoginService {

    // 서비스에서 로직을 수행한다



    //User 배열 두개 생성

    private static User user[] = new User[1];
    public String nowlogin = "";
    public static void main(String[] args){
        for(int i=0;i<2;i++)
        { user[i] = new User();}

        user[0].User("jinurumi",25);
        user[1].User("jinwoo",29);



    //로그인 요청이 왔을 때 가지고 있는 객체를 조회하여 이름과 나이가 일치하면 '로그인 성공' 로직을 짠다.
        //결과적으로 성공했다면 모델객체로 회원의 이름을 프론트로 전달하고 실패면 실패했다 알린다.
        //uid uage는 웹에서 넘어오는 정보
        Scanner sc = new Scanner(System.in);
        String uid = sc.nextLine();
        Integer uage = sc.nextInt();


        //

        for(int i = 0 ; i < 2; i++)
        {

            if (user[i].getId().equals(uid) && user[i].getAge().equals(uage))
            {
                nowlogin = "success";

                return ;
            }else if (!user[i].getId().equals(uid))
            {
                nowlogin = "ID error";
                return;
            }
            else if (user[i].getId().equals(uid) && !user[i].getAge().equals(uage))
            {
                nowlogin = "AGE error";
                return;
            }
            else {
            }

        }









    }


}




