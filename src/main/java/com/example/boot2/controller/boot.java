package com.example.boot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class boot {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "xixi";
    }
}
