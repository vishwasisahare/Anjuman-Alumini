<%-- 
    Document   : index
    Created on : 16-Nov-2022, 10:53:47 PM
    Author     : Amit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" data-theme="light" data-layout="topnav" data-topbar-color="dark" data-layout-mode="fluid" data-layout-position="fixed">


    <head>
        <meta charset="utf-8" />
        <title>Alumni | Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="links.jsp" %>

    </head>

    <body>
        <div class="account-pages pt-2 pt-sm-5 pb-4 pb-sm-5">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-xxl-4 col-lg-5">
                        <div class="card">

                            <!-- Logo -->
                            <div class="card-header pt-4 pb-4 text-center bg-primary">
                                <a href="index.jsp">
                                    <h1 class="text-white">Alumni</h1>
                                </a>

                            </div>

                            <div class="card-body p-4">
                                <span class="text-danger"> ${param.message}</span>
                                <div class="text-center w-75 m-auto">
                                    <h4 class="text-dark-50 text-center pb-0 fw-bold">Sign In</h4>
                                    <p class="text-muted mb-4">Enter your Phone and password to access User panel.</p>
                                </div>

                                <form action="UserController" method="post">
                                    <input type="hidden" name="action" value="login">

                                    <div class="mb-3">
                                        <label for="emailaddress" class="form-label"> Phone Number</label>
                                        <input class="form-control" name="phone" type="number" id="phonenumber" required="" placeholder="Enter your number">
                                    </div>

                                    <div class="mb-3">
                                        <label for="password" class="form-label">Password</label>
                                        <div class="input-group input-group-merge">
                                            <input type="password" name="password" id="password" class="form-control" placeholder="Enter your password">
                                            <div class="input-group-text" data-password="false">
                                                <span class="password-eye"></span>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="mb-3 mb-0 text-center">
                                        <button class="btn btn-primary" type="submit"> Log In </button>
                                    </div>

                                </form>
                            </div> <!-- end card-body -->
                        </div>
                        <!-- end card -->

                        <div class="row mt-3">
                            <div class="col-12 text-center">
                                <p class="text-muted">Don't have an account? <a href="registration.jsp" class="text-muted ms-1"><b>Sign Up</b></a></p>
                            </div> <!-- end col -->
                        </div>
                        <!-- end row -->

                    </div> <!-- end col -->
                </div>
                <!-- end row -->
            </div>
            <!-- end container -->
        </div>
        <footer class="footer footer-alt">
            <!--            2018 - <script>document.write(new Date().getFullYear())</script> © Hyper - Coderthemes.com-->
        </footer>
        <!-- Vendor js -->
        <script src="assets/js/vendor.min.js"></script>

        <!-- App js -->
        <script src="assets/js/app.min.js"></script>

    </body>

</html> 