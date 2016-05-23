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

    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul id="projectList" class="nav navbar-nav">
                    <li><button type="button" id="users_list" class="btn btn-default navbar-btn">Users</button></li>
                    <li><button type="button" id="issues_list" class="btn btn-default navbar-btn">Issues</button></li>
                    <li><button type="button" id="projects_list" class="btn btn-default navbar-btn">Projects</button></li>
                    <li><button type="button" id="add_user" class="btn btn-default navbar-btn">Add User</button></li>
                    <li><button type="button" id="add_project" class="btn btn-default navbar-btn">Add Project</button></li>
                    <li><button type="button" id="delete_user" class="btn btn-default navbar-btn">Delete User</button></li>
                    <li><button type="button" id="delete_project" class="btn btn-default navbar-btn">Delete Project</button></li>

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Projects <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="/">Default</a></li>
                            <c:forEach items="${projects}" var="project">
                                <li><a href="/project/${project.p_id}">${project.title}</a></li>
                            </c:forEach>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <table class="table table-striped">
        <thead>
        <tr>
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
    $('.dropdown-toggle').dropdown();

    $('#add_user').click(function(){
        window.location.href='/user_add_page';
    })

    $('#add_project').click(function(){
        window.location.href='/project_add_page';
    })

    $('#delete_project').click(function(){
        window.location.href='/project_add_page';
    })

    $('#issues_list').click(function(){
        window.location.href='/issues';
    })

    $('#projects_list').click(function(){
        window.location.href='/projects';
    })

    $('#users_list').click(function(){
        window.location.href='/users';
    })

    $('#delete_user').click(function(){
        var data = { 'toDelete[]' : []};
        $(":checked").each(function() {
            data['toDelete[]'].push($(this).val());
        });
        $.post("/user/delete", data);
    })

    $( "li .searchterm" ).click(function() {
        console.log('testing');
    });
</script>

</body>
</html>