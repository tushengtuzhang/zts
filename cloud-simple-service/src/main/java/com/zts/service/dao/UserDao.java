package com.zts.service.dao;

import com.zts.service.domain.User;

import java.util.List;

/**
 * Created by zhangts on 2017-07-15.
 */
public interface UserDao {

    List<User> findAll();
}
