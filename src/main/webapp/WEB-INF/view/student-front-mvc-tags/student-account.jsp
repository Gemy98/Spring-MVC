<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>  
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error{
	color: red ; 
	font-weight: bold ; 

}
</style>

</head>

<body>


<f:form modelAttribute="student" action="processmvctags">

    FirstName : <f:input path="fname"/>
    <f:errors path="fname" cssClass="error" />
    <br>
    
    LastName  :	<f:input path="lname"/>
    
    <br>
	
	Age :		<f:input path="age"/>
			    <f:errors path="age" cssClass="error" />
	
	<br>
	Country :
			 	<f:select path="country">
					<f:options items="${student.countrylist}"/>
				</f:select>
				
				<br>
					<f:radiobutton path="language" value="Java"/>java
					<f:radiobutton path="language" value="C++"/>C++
					<f:radiobutton path="language" value="Python"/>Python
					<f:radiobutton path="language" value="Kotlin"/>Kotlin
					<f:radiobutton path="language" value="Dart"/>Dart
					
				<br>
				
				<p>
				
					<f:checkbox path="player" value="Messi"/>Messi
					<f:checkbox path="player" value="Cr7"/>Cr7
					<f:checkbox path="player" value="Salah"/>Salah
					<f:checkbox path="player" value="Hazard"/>Hazard
					<f:checkbox path="player" value="Neymar"/>Neymar
				
				</p>
				
		<br>		
				
		<input type="submit" value="Done">
	
</f:form>

</body>
</html>