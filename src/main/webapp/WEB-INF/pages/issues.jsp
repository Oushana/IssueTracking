<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Issue List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h3><a href="/">Issues List</a></h3>

    <jsp:include page="navigatioBar.jsp" flush="true"/>
    <button type="button" id="delete_issue" class="btn btn-default navbar-btn">Delete Issue</button>

    <table class="table table-striped">
        <thead>
        <tr>
            <td></td>
            <td><b>Id</b></td>
            <td><b>Reporter Id</b></td>
            <td><b>Assignee Id</b></td>
            <td><b>Title</b></td>
            <td><b>Description</b></td>
            <td><b>Priority</b></td>
            <td><b>Status</b></td>
            <td><b>Project Id</b></td>
        </tr>
        </thead>
        <c:forEach items="${issues}" var="issue">
            <tr>
                <td><input type="checkbox" name="toDelete[]" value="${issue.i_id}" id="checkbox_${issue.i_id}"/></td>
                <td>${issue.i_id}</td>
                <td>${issue.reporterId}</td>
                <td>${issue.asigneeId}</td>
                <td>${issue.title}</td>
                <td>${issue.description}</td>
                <td>${issue.priority}</td>
                <td>${issue.status}</td>
                <td>${issue.projectId}</td>
            </tr>
        </c:forEach>
    </table>
</div>

<script>

    $('#delete_issue').click(function () {
        var data = {'toDelete[]': []};
        $(":checked").each(function () {
            data['toDelete[]'].push($(this).val());
        });
        $.post("/issue/delete", data);
    });

</script>

</body>
</html>