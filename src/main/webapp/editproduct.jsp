<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="editproductfromdatabase" modelAttribute="editloadproduct" method="post">
<form:input path="name"/><br>
<form:input path="type"/><br>
<form:input path="cost"/><br>

<form:button>Edit Product</form:button>

</form:form>

</body>
</html>