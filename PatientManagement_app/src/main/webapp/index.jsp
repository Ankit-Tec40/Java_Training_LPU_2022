<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    <title>Patient Management System</title>

</head>

<body>

<div class="container">

    <nav class="navbar navbar-expand-sm bg-light">
        <div class="container-fluid">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="index.html">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="register.html">Login/Register</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Account</a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="mt-4 p-5 bg-primary text-white rounded">
        <h1>Welcome to Patient Management System</h1>
        <p>One Stop Solution for your needs</p>
    </div>

    <br>

    <h1>Login</h1>


    <form action="Auth" method="post">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input type="email" class="form-control form-control" name="txtEmail" id="txtEmail" style="width:320px;">
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input type="password" class="form-control" name="txtPassword" id="txtPassword" style="width:320px;">
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
    </form>

</div>

</body>
</html>