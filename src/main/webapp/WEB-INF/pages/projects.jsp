<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Projects List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h3><a href="/">Projects List</a></h3>

    <jsp:include page="navigatioBar.jsp" flush="true" />
    <button type="button" id="delete_project" class="btn btn-default navbar-btn">Delete Project</button>

    <table class="table table-striped">
        <thead>
        <tr>
            <td></td>
            <td><b>Id</b></td>
            <td><b>Title</b></td>
            <td><b>Description</b></td>
            <td><b>Project Lead Id</b></td>
        </tr>
        </thead>
        <c:forEach items="${projects}" var="project">
            <tr>
                <td><input type="checkbox" name="toDelete[]" value="${project.p_id}" id="checkbox_${project.p_id}"/></td>
                <td>${project.p_id}</td>
                <td>${project.title}</td>
                <td>${project.description}</td>
                <td>${project.leadId}</td>
            </tr>
        </c:forEach>
    </table>
</div>

<script>

    $('#delete_project').click(function(){
        var data = { 'toDelete[]' : []};
        $(":checked").each(function() {
            data['toDelete[]'].push($(this).val());
        });
        $.post("/project/delete", data);
    });


</script>

</body>
</html>