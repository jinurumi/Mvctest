package com.example.Mvctest;


import com.example.Mvctest.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvctestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvctestApplication.class, args);

		//User객체 두개 생성
		User jinhye = new User();
		jinhye.setId("jinurumi");
		jinhye.setAge(25);
		User jinwoo = new User();
		jinwoo.setId("jinwoo");
		jinwoo.setAge(29);


		//로그인 요청이 왔을 때 가지고 있는 객체를 조회하여 이름과 나이가 일치하면 '로그인 성공' 로직을 짠다.

		//결과적으로 성공했다면 모델객체로 회원의 이름을 프론트로 전달하고 실패면 실패했다 알린다.

		//Api 규격 맞추기

	}

}
