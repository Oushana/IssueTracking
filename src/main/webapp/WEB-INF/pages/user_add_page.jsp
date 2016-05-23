<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New User</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <form role="form"  class="form-horizontal" action="/user/add" method="post">
        <h3>New user</h3>

        <input class="form-control form-user" type="text" name="username" placeholder="UserName">
        <input class="form-control form-user" type="text" name="name" placeholder="Name">
        <input class="form-control form-user" type="text" name="surname" placeholder="Surname">
        <input class="form-control form-user" type="text" name="email" placeholder="E-mail">

        <input type="submit" class="btn btn-primary" value="Add">
    </form>
</div>

</body>
</html>