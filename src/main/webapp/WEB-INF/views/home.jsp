<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Course Registration</title></head>
<body>
<h2>Course Registration</h2>

<form action="/register" method="post">
    Name: <input type="text" name="name" value="${student.name}" readonly /><br/>
    Email: <input type="text" name="email" value="${student.email}" readonly /><br/>
    Register Number: <input type="text" name="registerNumber" required /><br/>
    Programme: <input type="text" name="programme" required /><br/>

    Course:
    <select name="selectedCourse" required>
        <c:forEach var="course" items="${courses}">
            <option value="${course.id}">${course.name}</option>
        </c:forEach>
    </select><br/>

    <input type="submit" value="Submit" />
</form>
</body>
</html>
