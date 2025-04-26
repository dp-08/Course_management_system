<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>All Courses</title>
</head>
<body>
<h2>Available Courses</h2>
<ul>
    <c:forEach var="course" items="${courses}">
        <li>
            <strong>${course.name}</strong> - ${course.description}
            <a href="/courses/${course.id}">View</a>
        </li>
    </c:forEach>
</ul>
<a href="/">Back to Home</a>
</body>
</html>
