<%@page import="com.jeremie.www.entity.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>成功页面</title>
    <meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    success! <br>
    <table border="1">
    	<tr>
    		<td>${user.id}</td>
     		<td>${user.userNum}</td>
     		<td>${user.password}</td>
     		<td>${user.name}</td>
     		<td>${user.clazz}</td>
     		<td>${user.telephone}</td>
     		<td>${user.shortTelephone}</td>
     		<td>${user.qq}</td>
     		<td>${user.userType}</td>
     		<td>test</td>
     	</tr>
     </table>
  </body>
</html>
