package com.example.Mvctest;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class User {
    private String name;
    private String age;

    @JsonCreator
    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
