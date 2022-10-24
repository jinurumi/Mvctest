package com.example.Mvctest.service;
import com.example.Mvctest.model.User;
import com.example.Mvctest.repository.MemoryUserRepository;
import com.example.Mvctest.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {

    private final UserRepository userRepository = new MemoryUserRepository();

    //회원가입
    public Long join(User user) {
        validateDuplicateUser(user); //중복회원검증
        userRepository.save(user);
        return user.getId();
    }

    private void validateDuplicateUser(User user) {
        userRepository.findByName(user.getName())
                .ifPresent(user1 -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });

    }

    //전체회원조회
    public List<User> findUsers() {
        return userRepository.findAll();
    }

    //특정이름 회원조회
    public Optional<User> findOne(String username) {
        return userRepository.findByName(username);
    }

//논리 오류가 있는거같음
    public void login(User user) {
        if(userRepository.findByName(user.getName()).isPresent()) {
            if(userRepository.findByAge(user.getAge()).isPresent()) {
                System.out.println("로그인 성공!");
            }
        }
        if(userRepository.findByName(user.getName()).isEmpty()) {
            System.out.println("이름이 존재하지 않습니다.");
        }
        if(userRepository.findByAge(user.getAge()).isEmpty()) {
            System.out.println("나이가 존재하지 않습니다.");
        }
        else{
            System.out.println("로그인 실패");
    }

    }








}





