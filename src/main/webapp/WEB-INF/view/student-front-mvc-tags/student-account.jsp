<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>  
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<f:form modelAttribute="student" action="processmvctags">

	<f:input path="fname"/>
	<f:input path="lname"/>
	<f:input path="age"/>
	<input type="submit" value="Done">
	
</f:form>

</body>
</html>