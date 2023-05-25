package com.example.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Integer id;
    private String login;
    private String password;
    private String name;
    private Address address;

    public static User getUser(String login){
        var user = new User();
        user.setLogin(login);
        return user;
    }
}
