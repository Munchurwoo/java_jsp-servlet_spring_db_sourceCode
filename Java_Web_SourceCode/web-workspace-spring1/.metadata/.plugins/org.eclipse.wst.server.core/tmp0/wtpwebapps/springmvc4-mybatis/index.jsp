<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> springmvc와 mybatis 연동 </title>
</head>
<body>
<h3>springmvc와 mybatis 연동</h3>
<a href="home.do">hello test</a>
<%--
	org.kosta.controller.HomeController 
	home()
	  |
	views/result.jsp 에서 응답 
 --%>
 <form action="findCustomerById.do">
 고객 아이디 <input type="text" name="id">
 <input type="submit" value="검색">
 </form>
</body>
</html>