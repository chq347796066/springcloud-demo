package com.chen.springcloudserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("server调用");
        return "server 被调用了";
    }
}
