package com.zts.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zts.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangts on 2017-07-15.
 */
@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    final String SERVICE_NAME="cloud-simple-service";

    @HystrixCommand(fallbackMethod = "fallbackSearchAll")
    public List<User> readUserInfo() {
        return restTemplate.getForObject("http://"+SERVICE_NAME+"/user", List.class);
    }

    private List<User> fallbackSearchAll() {
        System.out.println("HystrixCommand fallbackMethod handle!");
        List<User> ls = new ArrayList<User>();
        User user = new User();
        user.setUserName("TestHystrixCommand");
        ls.add(user);
        return ls;
    }


}
