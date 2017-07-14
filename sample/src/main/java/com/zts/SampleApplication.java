package com.zts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zhangts on 2017-07-10.
 */
//@EnableAutoConfiguration/*(exclude={DataSourceAutoConfiguration.class})*/
//@Configuration
//@ComponentScan
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SampleApplication {
    public static void main(String[] args){
        SpringApplication.run(SampleApplication.class,args);
    }
}
