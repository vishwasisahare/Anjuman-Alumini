<!DOCTYPE html>
<html lang="en" data-theme="light" data-layout="topnav" data-topbar-color="dark" data-layout-mode="fluid" data-layout-position="fixed">


    <head>
        <meta charset="utf-8" />
        <title>Alumni | Register</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- App favicon -->
        <link rel="shortcut icon" href="assets/images/favicon.ico">

        <!-- Theme Config Js -->
        <script src="assets/js/hyper-config.js"></script>

        <!-- Icons css -->
        <link href="assets/css/icons.min.css" rel="stylesheet" type="text/css" />

        <!-- App css -->
        <link href="assets/css/app-creative.min.css" rel="stylesheet" type="text/css" id="app-style" />
    </head>

    <body class="authentication-bg">

        <div class="account-pages pt-2 pt-sm-5 pb-4 pb-sm-5">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-xxl-4 col-lg-5">
                        <div class="card">
                            <!-- Logo-->
                            <div class="card-header pt-4 pb-4 text-center bg-primary">
                                <a href="index.jsp">
                                    <h2 class="text-white text-center mt-0 fw-bold">Alumni</h2>
                                </a>
                            </div>

                            <div class="card-body p-4">

                                <div class="text-center w-75 m-auto">
                                    <h4 class="text-dark-50 text-center mt-0 fw-bold">Free Sign Up</h4>
                                    <p class="text-muted mb-4">Don't have an account? Create your account, it takes less than a minute </p>
                                </div>

                                <form action="UserController" method="post">
                                    <input type="hidden" name="action" value="insert">
                                    <input type="hidden" name="userType" value="student">
                                    <div class="mb-3">
                                        <label for="fullname" class="form-label">Full Name</label>
                                        <input class="form-control" type="text" name="fullname" id="fullname" placeholder="Enter your name" required>
                                    </div>

                                    <div class="mb-3">
                                        <label for="emailaddress" class="form-label">Email address</label>
                                        <input class="form-control" type="email" name="email" id="emailaddress" required placeholder="Enter your email">
                                    </div>

                                    <div class="mb-3">
                                        <label for="phonenumber" class="form-label">Phone Number</label>
                                        <input class="form-control" type="number" name="phone" id="phonenumber" required placeholder="Enter your number">
                                    </div>

                                    <div class="mb-3">
                                        <label for="password" class="form-label">Password</label>
                                        <div class="input-group input-group-merge">
                                            <input type="password" id="password" name="password" class="form-control" placeholder="Enter your password">
                                            <div class="input-group-text" data-password="false">
                                                <span class="password-eye"></span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="mb-3">
                                        <label for="emailaddress" class="form-label">Select Your Branch</label>
                                        <select class="form-control" name="branch" required>
                                            <option selected disabled value="">Select Your Branch</option>
                                            <option value="CIVIL">CIVIL ENGINEERING</option>
                                            <option value="COMPUTER">COMPUTER SCIENCE & ENGINEERING</option>
                                            <option value="ELECTRICAL">ELECTRICAL ENGINEERING</option>
                                            <option value="ELECTRONICS">ELECTRONICS & TELECOMMUNICATION ENGINEERING</option>
                                            <option value="MECHANICAL">MECHANICAL ENGINEERING</option>
                                        </select>
                                    </div>
                                    <div class="mb-3">
                                        <label for="phonenumber" class="form-label">Select Passout Year</label>
                                        <select class="form-control" id="ddlYears" name="passYear" required="">
                                            <option selected="" disabled="" value="">Select Passout year</option>
                                            <option  value="Pursuing">Pursuing</option>
                                        </select>
                                    </div>
                                    <div class="mb-3 text-center">
                                        <button class="btn btn-primary" type="submit"> Sign Up </button>
                                    </div>

                                </form>
                            </div> <!-- end card-body -->
                        </div>
                        <!-- end card -->

                        <div class="row mt-3">
                            <div class="col-12 text-center">
                                <p class="text-muted">Already have account? <a href="index.jsp" class="text-muted ms-1"><b>Log In</b></a></p>
                            </div> <!-- end col-->
                        </div>
                        <!-- end row -->

                    </div> <!-- end col -->
                </div>
                <!-- end row -->
            </div>
            <!-- end container -->
        </div>
        <!-- end page -->

        <footer class="footer footer-alt">
        </footer>

        <!-- Vendor js -->
        <script src="assets/js/vendor.min.js"></script>

        <!-- App js -->
        <script src="assets/js/app.min.js"></script>
        <script type="text/javascript">
            window.onload = function () {
                //Reference the DropDownList.
                var ddlYears = document.getElementById("ddlYears");

                //Determine the Current Year.
                var currentYear = (new Date()).getFullYear();

                //Loop and add the Year values to DropDownList.
                for (var i = 1950; i <= currentYear; i++) {
                    var option = document.createElement("OPTION");
                    option.innerHTML = i;
                    option.value = i;
                    ddlYears.appendChild(option);
                }
            };
        </script>
    </body>

</html>
