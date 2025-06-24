package com.arif.org.my_web_project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyRestController {
    public String hello(){
        return "hello";
    }
}
