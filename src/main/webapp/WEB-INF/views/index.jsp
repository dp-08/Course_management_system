<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #ffecd2, #fcb69f);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            color: #333;
        }

        .welcome-container {
            background-color: #ffffff;
            padding: 50px;
            border-radius: 15px;
            text-align: center;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
        }

        h1 {
            font-size: 36px;
            margin-bottom: 20px;
            color: #f06292;
        }

        p {
            font-size: 18px;
            margin-bottom: 30px;
            color: #555;
        }

        a.button {
            background-color: #f06292;
            color: #fff;
            padding: 12px 25px;
            border-radius: 8px;
            text-decoration: none;
            font-weight: bold;
            font-size: 16px;
            transition: background-color 0.3s ease;
        }

        a.button:hover {
            background-color: #ec407a;
        }
    </style>
</head>
<body>

<div class="welcome-container">
    <h1>Welcome to Course Management System</h1>
    <p>Please login to continue</p>
    <a href="login" class="button">Login</a>
</div>

</body>
</html>
