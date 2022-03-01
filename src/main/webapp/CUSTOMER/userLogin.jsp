<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<form >
  <section >
  <div class="container">
      <div class="row justify-content-center align-items-center"style="margin-left:350px;">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card shadow-2-strong" style="border-radius: 1rem;">
          <div class="card-body text-center">
            <h3 class="mb-5">Sign in</h3>
              </div>

            <div class="form-outline">
              <label class="form-label" for="typeEmailX-2">Email</label>
              <input type="email" id="typeEmailX-2" class="form-control form-control-lg" style="margin-bottom: 10px;"/>
            </div>

            <div class="form-outline">
              <label class="form-label" for="typePasswordX-2">Password</label>
              <input type="password" id="typePasswordX-2" class="form-control form-control-lg" style="margin-bottom: 10px;"/>
            </div>

            <button class="btn btn-primary btn-lg btn-block" type="submit" style="margin-bottom: 10px;">Login</button>
            <p class="text-center text-muted mt-5 mb-0">Have already an account? <a href="register.jsp" class="fw-bold text-body">Registration here</a></p>
        </div>
      </div>
    </div>
 </div>
 </section>
</form>
</body>
</html>
