<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<!-- saved from url=(0064)http://www.17sucai.com/preview/137615/2015-01-15/demo/index.html -->
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<META content="IE=11.0000" http-equiv="X-UA-Compatible">
		<META http-equiv="Content-Type" content="text/html; charset=utf-8"> 
		<META name="GENERATOR" content="MSHTML 11.00.9600.17496"></HEAD>
		<title>超市物资管理系统</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/login.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery/jquery-1.10.2.min.js"></script>
	</head>
	<body>
		<DIV class="top_div">
			<p style="text-align:center;margin: 0 auto;font:60px bold italic;"></p>
		</DIV>
		<DIV style="background: rgb(255, 255, 255); margin: -100px auto auto; border: 1px solid rgb(231, 231, 231); border-image: none; width: 400px; height: 200px; text-align: center;">
			<DIV style="width: 165px; height: 96px; position: absolute;">
				<DIV class="tou"></DIV>
				<DIV class="initial_left_hand" id="left_hand"></DIV>
				<DIV class="initial_right_hand" id="right_hand"></DIV>
			</DIV>
			<P style="padding: 30px 0px 10px; position: relative;">
				<SPAN class="u_logo"></SPAN>         
				<INPUT class="ipt" type="text" placeholder="请输入用户名" value="" name="username" id="username"> 
    		</P>
			<P style="position: relative;">
				<SPAN class="p_logo"></SPAN>         
				<INPUT class="ipt" id="password" type="password" placeholder="请输入密码" value="" name="password" id="password">   
  			</P>
			<DIV style="height: 50px; line-height: 50px; margin-top: 30px; border-top-color: rgb(231, 231, 231); border-top-width: 1px; border-top-style: solid;">
				<P style="margin: 0px 35px 20px 45px;">
					<SPAN style="float: left;">
						<A style="color: rgb(204, 204, 204);" href="#">忘记密码?</A>
					</SPAN> 
           			<SPAN style="float: right;">
           				<A style="color: rgb(204, 204, 204); margin-right: 10px;" href="#">注册</A>  
              			<A style="background: rgb(0, 142, 173); padding: 7px 10px; border-radius: 4px; border: 1px solid rgb(26, 117, 152); border-image: none; color: rgb(255, 255, 255); font-weight: bold;" href="#" id="login" name="login">
              				登录
              			</A> 
           			</SPAN>         
           		</P>
           	</DIV>
          </DIV>
	</body>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/login.js"></script>	
</html>
