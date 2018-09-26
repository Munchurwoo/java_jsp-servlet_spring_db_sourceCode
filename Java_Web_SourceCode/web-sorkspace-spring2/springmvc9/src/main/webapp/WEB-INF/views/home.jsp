<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
<h3>springmvc9 부서와 사원정보</h3>
부서수 ${deptCount } <br>

총부서수 ${deptCount } 총사원수 ${empCount}
<%--
	개발순서
	sql 확인
	uitTest 클래스를 추가 (EmpUnitTest)
	EmpDAO 와 EmpDAOImpl 을 생성
	EmpUnitTest 에서 총사원수 조회 단위 테스트 
	HomeController의 home 메서드를 수정
 --%>
 	<a href="empHome.do">사원관리</a>
	<%-- 
		EmpController 추가 
		empHome() 를 이용해
		emp_home.jsp 를 제공한다.
	 --%>
</body>
</html>