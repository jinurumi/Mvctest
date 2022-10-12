package com.example.Mvctest.model;
import java.util.*;
import lombok.Data;

@Data
public class User {
    static private String id;
    static private Integer age;


    //내부 회원생성함수
    public void User(String id, Integer age) {
        this.id =id;
        this.age =age;
    }

    public User(){}

    //getter setter 함수
    void setId(String id) {
       this.id = id;
    }
    public String getId() {
        return id;
    }
    void setAge(Integer age) {
        this.age =age;
    }
    public Integer getAge() {
        return age;
    }
}



