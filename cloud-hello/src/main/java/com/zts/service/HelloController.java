package com.zts.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangts on 2017-07-15.
 */
@Controller
@SpringBootApplication
public class HelloController {

    @ResponseBody
    @RequestMapping("/")
    public String hello(){
        return "Hello World!";
    }

    public static void main(String[] args){
        SpringApplication.run(HelloController.class,args);
        //SpringApplication.run(HelloController.class,"--server.port=8081");
    }
}
