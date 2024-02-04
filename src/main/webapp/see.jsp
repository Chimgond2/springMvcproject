<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2px solid black">
<thead>
<tr>
<th>ID</th>
<th>name</th>
<th>email</th>
<th>edit</th>
<th>delete</th>

</tr>
<c:forEach var="loopf" items="${fine}">
<tr>

<td> ${loopf.getId()}</td>
<td>${loopf.getName()}</td>
<td>${loopf.getMail()}</td>
<td ><a href="edituser?id=${loopf.getId() }">edit</a></td>
<td ><a href="deleteuser?id=${loopf.getId() }">delete</a></td>

</tr>
</c:forEach>


</thead>
</table>
</body>
</html>

 