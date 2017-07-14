package com.zts.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by zhangts on 2017-07-15.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SimpleApplication {

    public static void main(String[] args){
        SpringApplication.run(SimpleApplication.class,args);
    }
}
