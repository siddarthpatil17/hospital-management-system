<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
    <style>
         body {
            font-family: Arial, sans-serif;
            background-color:  #d6cece;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        form {
            background-color:#f0d9d9;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
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
    <form method="post" onsubmit="sendmail">
        <h2>Forgot Password</h2>
        <p>Enter your email address to receive a password reset link.</p>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <button type="submit">Submit</button>
    </form>
    <script type="text/javascript" src="https://smtpjs.com/v3/smtp.js"></script>
    <script type="text/javascript">
    function sendmail()
    {
    	Email.send({
    	    Host : "smtp.gmail.com",
    	    Username : "siddartpatil17@gmail.com",
    	    Password : "Siddarth@2505",
    	    To : docoment.getElementById("email").value ,
    	    From : "siddartpatil17@gmail.com",
    	    Subject : "link to reset",
    	    Body : `Click on the link to reset password: /HospitalManagementSyas/src/main/webapp/passwordreset.jsp`
    	}).then(
    	  message => alert(message)
    	);
    }
    </script>
</body>
</html>
