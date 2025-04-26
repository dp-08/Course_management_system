<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Confirmation</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #ffecd2, #fcb69f);
            padding: 40px;
            margin: 0;
        }

        .confirmation-container {
            max-width: 600px;
            margin: auto;
            background-color: #ffffff;
            padding: 35px;
            border-radius: 15px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            color: #f06292;
            margin-bottom: 30px;
            font-size: 28px;
        }

        .info {
            font-size: 18px;
            margin: 15px 0;
            color: #333;
        }

        .info label {
            font-weight: bold;
            color: #555;
            display: inline-block;
            width: 180px;
        }
    </style>
</head>
<body>

<div class="confirmation-container">
    <h2>Registration Successful</h2>
    <div class="info"><label>Name:</label> ${student.name}</div>
    <div class="info"><label>Email:</label> ${student.email}</div>
    <div class="info"><label>Register Number:</label> ${student.registerNumber}</div>
    <div class="info"><label>Programme:</label> ${student.programme}</div>
    <div class="info"><label>Selected Course:</label> ${student.selectedCourse}</div>
</div>

</body>
</html>
