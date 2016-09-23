package com.supermark.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.supermark.entity.User;

@Repository("userDao")
public interface UserDao {

	public User getUser(Integer id);
	
	public User getUserByName(@Param("username") String username, @Param("password") String password);
}
