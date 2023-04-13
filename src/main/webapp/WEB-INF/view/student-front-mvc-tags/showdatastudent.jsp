<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>  
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<p>FirstName : ${student.fname}</p>
<p>LasttName : ${student.lname}</p>
<p>Age : ${student.age}</p>
<p>Age : ${student.country}</p>
<p>ProgrammingLanguage : ${student.language}</p>
<p>
<c:forEach var="pl" items="${student.player }">
    "${pl}"
</c:forEach>

</p>



</body>
</html>