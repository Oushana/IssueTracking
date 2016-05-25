<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Project</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <form role="form" class="form-horizontal" action="/project/add" method="post">
        <h3>New project</h3>

        <input class="form-control form-user" type="text" name="title" placeholder="Title">
        <input class="form-control form-user" type="text" name="description" placeholder="Description">
        <input class="form-control form-user" type="number" name="leadId" placeholder="Lead Id">

        <input type="submit" class="btn btn-primary" value="Add">
    </form>
</div>

</body>
</html>
