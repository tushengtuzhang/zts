package com.zts.service.controller;

import com.zts.service.domain.User;
import com.zts.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhangts on 2017-07-15.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<User> list(){
        return userService.searchAll();
    }




}
