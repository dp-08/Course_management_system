<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Register</title></head>
<body>
<h2>Registration</h2>
<form action="/register" method="post">
    <input type="hidden" name="name" value="${student.name}" />
    <input type="hidden" name="email" value="${student.email}" />

    Register Number: <input type="text" name="registerNumber" required /><br/>
    Programme: <input type="text" name="programme" required /><br/>

    Course:
    <select name="selectedCourse">
        <c:forEach var="course" items="${courses}">
            <option value="${course.id}">${course.name}</option>
        </c:forEach>
    </select><br/>

    <input type="submit" value="Submit" />
</form>
</body>
</html>
