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
        <title>Alumni | Feedback</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="links.jsp" %>

    </head>

    <body>
        <!-- Begin page -->
        <div class="wrapper">
            <%@include file="navbar.jsp" %>
            <!-- ============================================================== -->
            <!-- Start Page Content here -->
            <!-- ============================================================== -->

            <div class="content-page">
                <div class="content">

                    <!-- Start Content-->
                    <div class=" card container mt-2 p-3">
                        <section class="mb-4">

                            <!--Section heading-->
                            <h2 class="h1-responsive font-weight-bold text-center my-4">Feedback</h2>
                            <div class="text-center mb-2">
                                <span class="text-success"><b>${param.message}</b></span>
                            </div>
                            <!--Section description-->
                            <p class="text-center w-responsive mx-auto mb-5">Do you have any questions? Please do not hesitate to contact us directly. Our team will come back to you within
                                a matter of hours to help you.</p>

                            <div class="row">
                                <!--Grid column-->
                                <div class="col-md-8 mb-md-0 mb-5 offset-md-2">
                                    <form action="FeedbackController" method="POST">
                                        <input type="hidden" name="action" value="insert">
                                        <!--Grid row-->
                                        <div class="row">
                                            <!--Grid column-->
                                            <div class="col-md-6">
                                                <div class="md-form mb-1">
                                                    <label for="name" class="">Your name</label>
                                                    <input type="text" id="name" name="name" class="form-control" required>
                                                </div>
                                            </div>
                                            <!--Grid column-->

                                            <!--Grid column-->
                                            <div class="col-md-6">
                                                <div class="md-form mb-1">
                                                    <label for="email" class="">Your email</label>
                                                    <input type="text" id="email" name="email" class="form-control" required>

                                                </div>
                                            </div>
                                            <!--Grid column-->

                                        </div>
                                        <!--Grid row-->
                                        <!--Grid row-->
                                        <div class="row">
                                            <!--Grid column-->
                                            <div class="col-md-12">
                                                <div class="md-form">
                                                    <label for="message">Your message</label>
                                                    <textarea type="text" id="message" name="message" rows="2" class="form-control md-textarea" required></textarea>
                                                </div>
                                            </div>
                                        </div>
                                        <!--Grid row-->
                                        <div class="text-center mt-1">
                                            <button type="submit" class="btn btn-success mt-2"><i class="mdi mdi-content-save"></i> Send</button>
                                        </div>
                                    </form>
                                    <div class="status"></div>
                                    <div class="row mt-5">
                                        <!--Grid column-->
                                        <div class="col-md-4 text-center">
                                            <ul class="list-unstyled mb-0">
                                                <li><i class=" uil-location-point fa-2x"></i>
                                                    <p>H.N 635C, Behind Babbu Galaxy Restaurant Katol Road, Chhaoni Rd, Nagpur, Maharashtra 440013</p>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="col-md-4 text-center">
                                            <ul class="list-unstyled mb-0">
                                                <li><i class=" uil-phone mt-4 fa-2x"></i>
                                                    <p>+ 91 9326 197 423</p>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="col-md-4 text-center">
                                            <ul class="list-unstyled mb-0">
                                                <li><i class="uil-envelope-alt mt-4 fa-2x"></i>
                                                    <p>azher@qaswatechnologies.com</p>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!--Grid column-->
                            </div>
                        </section>
                    </div>
                </div>
                <!-- container -->

            </div>
            <!-- content -->
            <%@include file="footer.jsp" %>
        </div>
        <!-- ============================================================== -->
        <!-- End Page content -->
        <!-- ============================================================== -->
    </div>
    <!-- END wrapper -->

    <%@include file="scripts.jsp" %>

</body>

</html> 