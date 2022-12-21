
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Login Page </title>
    <style>
        Body {
            font-family: Calibri, Helvetica, sans-serif;
            background-color: pink;
        }
        button {
            background-color: #4CAF50;
            width: 100%;
            color: orange;
            padding: 15px;
            margin: 10px 0px;
            border: none;
            cursor: pointer;
        }
        form {
            border: 3px solid #f1f1f1;
        }
        input[type=text], input[type=password] {
            width: 100%;
            margin: 8px 0;
            padding: 12px 20px;
            display: inline-block;
            border: 2px solid green;
            box-sizing: border-box;
        }
        button:hover {
            opacity: 0.7;
        }
        .cancelbtn {
            width: auto;
            padding: 10px 18px;
            margin: 10px 5px;
        }


        .container {
            padding: 25px;
            background-color: lightblue;
        }
    </style>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<center> <h1> Student Login Form </h1> </center>
<form action="login" method="post">
    <div class="container">
        <label>Username : </label>
        <input type="text" placeholder="Enter Username" name="username" required>
        <div class="alert alert-danger">
            message
        </div>
        <label>Password : </label>
        <input type="password" placeholder="Enter Password" name="password" required>
        <button type="submit">Login</button>
        <input type="checkbox" checked="checked"> Remember me
        <button type="button" class="cancel"> Cancel</button>
        Forgot <a href="#"> password? </a>
    </div>
</form>
</body>
</html>