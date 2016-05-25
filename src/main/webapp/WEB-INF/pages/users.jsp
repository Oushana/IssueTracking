<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container" id="container1">
    <h3><a href="/">Users List</a></h3>

    <jsp:include page="navigatioBar.jsp" flush="true"/>
    <button type="button" id="delete_user" class="btn btn-default navbar-btn">Delete User</button>

    <table class="table table-striped">
        <thead>
        <tr>
            <td></td>
            <td><b>Id</b></td>
            <td><b>UserName</b></td>
            <td><b>Name</b></td>
            <td><b>Surname</b></td>
            <td><b>E-mail</b></td>

        </tr>
        </thead>
        <c:forEach items="${users}" var="user">
            <tr>
                <td><input type="checkbox" name="toDelete[]" value="${user.u_id}" id="checkbox_${user.u_id}"/></td>
                <td>${user.u_id}</td>
                <td>${user.username}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.email}</td>

            </tr>
        </c:forEach>
    </table>

</div>

<script>

    $('#delete_user').click(function () {
        var data = {'toDelete[]': []};
        $(":checked").each(function () {
            data['toDelete[]'].push($(this).val());
        });
        $.post("/user/delete", data);
    });

</script>

</body>
</html>