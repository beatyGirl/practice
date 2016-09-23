package com.supermark.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.supermark.entity.User;
import com.supermark.service.UserService;
/**
 * �û�
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
	
	@Resource(name="userService")
	private UserService userService;

	@RequestMapping("/login")
	public void getUser(HttpServletRequest request,HttpServletResponse response){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Map<String, Object> map = new HashMap<String, Object>();

		User user = userService.getUser(username, password);
		if(user == null){
			map.put("msg", "");
			map.put("code", 500);
		}else{
			map.put("data", user);
			map.put("code", 200);
			request.getSession().setAttribute("user", user);
		}
		
		printJSON(request, response, map);
		
	}
}
