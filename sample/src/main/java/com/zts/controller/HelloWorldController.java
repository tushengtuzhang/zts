package com.zts.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangts on 2017-07-12.
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {
    @RequestMapping("/")
    public String hello(){
        return "Hello World1!";
    }

    public static void main(String[] args){
        SpringApplication.run(HelloWorldController.class,args);
    }
}
