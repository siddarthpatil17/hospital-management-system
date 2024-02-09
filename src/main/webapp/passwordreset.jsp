<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Password Reset</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #d6cece;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        form {
            background-color: #f0d9d9;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(78, 76, 76, 0.1);
            width: 300px;
            background-color: 9px;
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            box-sizing: border-box;
            border-radius: 9px;
        }

        button {
            background-color: #0056b3;
            color: #e2e0e0;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background-color: #14b246; /* Change background color on hover */
        }
    </style>
</head>
<body>
    <form action="reset_password.jsp" method="post">
        <h2>Password Reset</h2>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" >

        <label for="newPassword">New Password:</label>
        <input type="password" id="newPassword" name="newPassword" >

        <label for="confirmPassword">Confirm Password:</label>
        <input type="password" id="confirmPassword" name="confirmPassword" >

        <button type="submit">Reset Password</button>
    </form>
</body>
</html>
