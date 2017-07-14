package com.zts.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangts on 2017-07-15.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "index";
    }

    public static void main(String[] args){
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
