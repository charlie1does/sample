<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"
    uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
<title>sample ${service}</title>
</head>
<body>
To view the functionality, run<br/>
<a href="/serviceInteger?argument=13">/serviceInteger?argument=13</a><br/>
<a href="/serviceString?argument=str">/serviceString?argument=customString</a><br/>
<a href="/serviceError">/serviceError</a><br/>
<c:set var="sample" value="${value}"/>
Current value : <c:out value="${sample}"/>
</body>
</html>
