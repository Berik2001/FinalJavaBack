package com.example.finaldiploma.controllers;


import com.example.finaldiploma.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("login")
    public String login() {
        return "login";
    }
    @RequestMapping("register")
    public String register() {
        return "register";
    }
    @GetMapping("/register")
    public String createUserForm(User user){

        return "register";

    }

}