<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>${param.username}用户的的主页</h4>
<%-- <c:if test="${!empty param.username }">
				<span style="color:#FF0000">
				[${param.username }]登陆失败！</span>	
		</c:if> --%>
				
<a href="/BooksMS/updatepwd.jsp">修改密码</a>
</body>
</html>