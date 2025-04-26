<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #ffecd2, #fcb69f);
            padding: 40px;
            margin: 0;
        }

        .form-container {
            max-width: 500px;
            margin: auto;
            background-color: #ffffff;
            padding: 35px;
            border-radius: 15px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
            color: #f06292;
        }

        label {
            font-weight: bold;
            color: #333;
        }

        input, select {
            width: 100%;
            padding: 12px;
            margin: 10px 0 20px;
            border: 1px solid #ccc;
            border-radius: 8px;
            font-size: 15px;
            box-sizing: border-box;
        }

        input:focus, select:focus {
            outline: none;
            border-color: #f48fb1;
            box-shadow: 0 0 5px rgba(244, 143, 177, 0.5);
        }

        button {
            width: 100%;
            padding: 12px;
            background-color: #f06292;
            color: white;
            border: none;
            border-radius: 8px;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #ec407a;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h2>Student Registration</h2>
    <form action="register" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="registerNumber">Register Number:</label>
        <input type="text" id="registerNumber" name="registerNumber" required>

        <label for="programme">Programme:</label>
        <input type="text" id="programme" name="programme" required>

        <label for="selectedCourse">Select Course:</label>
        <select id="selectedCourse" name="selectedCourse" required>
            <c:forEach var="course" items="${courses}">
                <option value="${course.name}">${course.name}</option>
            </c:forEach>
        </select>

        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>
