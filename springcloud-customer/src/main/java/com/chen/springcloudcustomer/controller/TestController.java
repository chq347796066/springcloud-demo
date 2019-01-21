package com.chen.springcloudcustomer.controller;

import com.chen.springcloudcustomer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService service;

    @RequestMapping("/test")
    public String test(){

        return service.test();
    }
}
