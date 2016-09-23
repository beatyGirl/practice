package com.supermark.service;


import com.supermark.entity.User;

/**
 * Created by xiaoxi on 2016/9/21.
 */
public interface UserService {

    public User getUser(String username,String password);
}
