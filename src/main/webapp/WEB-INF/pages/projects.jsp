<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Projects List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h3><a href="/">Projects List</a></h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <td><b>Id</b></td>
            <td><b>Title</b></td>
            <td><b>Description</b></td>
            <td><b>Project Lead Id</b></td>
        </tr>
        </thead>
        <c:forEach items="${projects}" var="project">
            <tr>
                <td>${project.p_id}</td>
                <td>${project.title}</td>
                <td>${project.description}</td>
                <td>${project.leadId}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>