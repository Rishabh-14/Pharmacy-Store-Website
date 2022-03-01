<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <title>Registration Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
</html>
<body>
  <form class="container">
    <section >
        <div class="mask d-flex align-items-center gradient-custom-3">
          <div class="container">
            <div class="row d-flex justify-content-center align-items-center h-100"style="margin-left:300px;">
              <div class="col-12 col-md-9 col-lg-7 col-xl-6">
                <div class="card" style="border-radius: 15px;">
                  <div class="card-body p-5">
                    <h3 class="text-uppercase text-center mb-5">Registration</h3>
      
                      <div class="form-outline">
                        <label class="form-label" for="form3Example1cg">Your Name</label>
                        <input type="text" id="form3Example1cg" class="form-control form-control-lg" />
                      </div>
      
                      <div class="form-outline">
                        <label class="form-label" for="form3Example3cg">Email</label>
                        <input type="email" id="email" class="form-control form-control-lg" />
                      </div>
                      
                      <div class="form-outline">
                        <label class="form-label" for="form3Example3cg">Password</label>
                        <input type="password" id="password" class="form-control form-control-lg" />
                      </div>
                      
                                            <div class="form-outline">
                        <label class="form-label" for="form3Example3cg">Repeat Password</label>
                        <input type="password" id="repassword" class="form-control form-control-lg" />
                      </div>
      
                      <div class="form-outline">
                        <label class="form-label" for="form3Example4cg">Age</label>
                        <input type="text" id="age" class="form-control form-control-lg" />
                      </div>
      
                      <div class="form-outline">
                        <label class="form-label" for="form3Example4cg">Contact</label>
                        <input type="text" id="contact" class="form-control form-control-lg" />
                      </div>

                      <div class="form-outline">
                        <label class="form-label" for="form3Example4cg">City</label>
                        <input type="text" id="city" class="form-control form-control-lg" />
                      </div>

                      <div class="form-outline">
                        <label class="form-label" for="form3Example4cg">State</label>
                        <input type="text" id="state" class="form-control form-control-lg" />
                      </div>

                      <div class="form-outline">
                        <label class="form-label" for="form3Example4cg">Pin-code</label>
                        <input type="text" id="pincode" class="form-control form-control-lg" style="margin-bottom: 10px;"/>
                      </div>

                      <div class="d-flex justify-content-center">
                        <button type="button" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body" style="margin-bottom: 10px;">Register</button>
                      </div>
      
                      <p class="text-center text-muted mt-5 mb-0">Have already an account? <a href="userLogin.jsp" class="fw-bold text-body">Login here</a></p>
      
                    </form>
      
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
</body>
</html>