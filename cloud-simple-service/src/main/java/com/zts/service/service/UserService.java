package com.zts.service.service;

import com.zts.service.dao.UserDao;
import com.zts.service.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangts on 2017-07-15.
 */

@Service
public class UserService {

    @Autowired
    private UserDao userMapper;

    public List<User> searchAll(){
        List<User> list = userMapper.findAll();
        return list;
    }
}
