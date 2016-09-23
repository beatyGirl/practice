package com.supermark.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.supermark.entity.User;
import com.supermark.dao.UserDao;
import com.supermark.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource(name = "userDao")
	private UserDao userDao;
	
	public User getUser(String username,String password){
		User user = null;
		
		if(username == null || "".equals(username)){
			System.out.println("");
		}else if(password == null || "".equals(password)){
			System.out.println("");
		}else{
			user = userDao.getUserByName(username, password);
			if(user == null){
				System.out.println("");
			}else{
				System.out.println("");
			}
		}
		return user;
	}

}
