<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Issue</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <form role="form"  class="form-horizontal" action="/issue/add" method="post">
        <h3>New issue</h3>

        <input class="form-control form-user" type="number" name="reporterId" placeholder="Reporter Id">
        <input class="form-control form-user" type="number" name="asigneeId" placeholder="Asignee Id">
        <input class="form-control form-user" type="text" name="title" placeholder="Title">
        <input class="form-control form-user" type="text" name="description" placeholder="Description">
        <input class="form-control form-user" type="text" name="priority" placeholder="Priority">
        <input class="form-control form-user" type="text" name="status" placeholder="Status">
        <input class="form-control form-user" type="number" name="projectId" placeholder="ProjectId">

        <input type="submit" class="btn btn-primary" value="Add">
    </form>
</div>

</body>
</html>
