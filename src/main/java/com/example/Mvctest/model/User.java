package com.example.Mvctest.model;
import java.util.*;
import lombok.Data;

@Data
public class User {
    static private String id;
    static private Integer age;

    public static void setId(String id) {
        User.id = id;
    }
    public static String getId() {
        return id;
    }
    public static void setAge(int age) {
        User.age =age;
    }
    public static int getAge() {
        return age;
    }
}



