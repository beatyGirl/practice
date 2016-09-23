package com.supermark.controller;



import com.alibaba.fastjson.JSON;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BaseController {

	 protected void printJSON(HttpServletRequest servletRequest, HttpServletResponse servletResponse, Object obj) {
	        PrintWriter writer = null;
	        try {
	            writer = servletResponse.getWriter();
	            String jsoncallback = servletRequest.getParameter("jsoncallback");
	            if (null == jsoncallback || jsoncallback.isEmpty()) {
	                writer.print(JSON.toJSONString(obj));
	            } else {
	                writer.print(jsoncallback + "(" + JSON.toJSONString(obj) + ")");
	                System.out.println(jsoncallback + "(" + JSON.toJSONString(obj) + ")");
	            }
	        } catch (Exception e) {
	            System.out.println("" + e.getMessage());
	        } finally {
	            if (null != writer) {
	                writer.close();
	            }
	        }
	    }
}
