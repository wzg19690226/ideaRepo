package com.wzg.service.mapper;

import com.wzg.service.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author Administrator
 * Date 2019/2/17 13:57
 * version 1.0
 **/
public interface UserMapper {
    void insertUser(User user);
    List<User> getUserAll();
}

