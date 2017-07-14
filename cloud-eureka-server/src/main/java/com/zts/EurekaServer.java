package com.zts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by zhangts on 2017-07-15.
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    public static void main(String[] args){
        SpringApplication.run(EurekaServer.class,args);
    }
}
