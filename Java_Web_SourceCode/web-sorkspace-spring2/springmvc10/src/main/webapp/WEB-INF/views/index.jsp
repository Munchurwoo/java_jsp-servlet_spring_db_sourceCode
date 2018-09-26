<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>

사원 정보 Home
<%--
	select option 으로 사원번호 (empno) 를 제공 
	select option 을 선택하고 
	검색을 누르면 
	emp_info.jsp 에서 사원정보를 제공한다. 
	사원번호(empno), 사원명(ename), 직종(job),
	부서번호(deptNo), 부서명(dname), 지역(loc)를 제공하면 됨 
	
 --%>	
 	<form action="empList.do">
 	<select name="empNo">
 	<c:forEach items="${empNo }" var="emp">
 	<option value="${emp}"> ${emp }</option>
 	</c:forEach>
 	</select>
 	<input type="submit" value="검색">
 	</form>
</body>
</html>