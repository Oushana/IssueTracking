<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h3><a href="/">Users List</a></h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <td><b>Id</b></td>
            <td><b>UserName</b></td>
            <td><b>Name</b></td>
            <td><b>Surname</b></td>
            <td><b>E-mail</b></td>

        </tr>
        </thead>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.u_id}</td>
                <td>${user.username}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.email}</td>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>