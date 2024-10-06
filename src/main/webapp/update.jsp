<%-- 
    Document   : index
    Created on : 16-Nov-2022, 10:53:47 PM
    Author     : Amit
--%>

<%@page import="com.qaswatech.alumni.model.JobModel"%>
<%@page import="com.qaswatech.alumni.controller.JobController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" data-theme="light" data-layout="topnav" data-topbar-color="dark" data-layout-mode="fluid" data-layout-position="fixed">


    <head>
        <meta charset="utf-8" />
        <title>Dashboard | Hyper - Responsive Bootstrap 5 Admin Dashboard</title>
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
            <%
                String id = request.getParameter("userId");
                String pageForm = request.getParameter("page");
                UserController controller = new UserController();

            %>
            <div class="content-page">
                <div class="content">
                    <div class="row">
                        <div class="col-lg-8 offset-lg-2">
                            <% if (pageForm.equals("personal")) {
                                    UserModel user = controller.findByUserId(id);
                            %>
                            <form action="UserImageController" method="post" enctype="multipart/form-data">
                                <input type="hidden" name="action" value="update">
                                <input type="hidden" name="userId" value="<%= user.getUserId()%>">
                                <h5 class="mb-4 text-uppercase text-white bg-primary p-2"><i class="mdi mdi-account-circle me-1"></i>Update your Personal Info</h5>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="mb-3">
                                            <label for="profile" class="form-label">Profile Picture</label>
                                            <input type="file" class="form-control" name="profile" value="<%= user.getProfile()%>" accept="images/*" id="firstname" placeholder="Enter first name" required>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="mb-3">
                                            <label for="firstname" class="form-label">Name</label>
                                            <input type="text" class="form-control" name="name" value="<%= user.getName()%>" id="firstname" placeholder="Enter first name">
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="mb-3">
                                            <label for="email" class="form-label">Email</label>
                                            <input type="email" class="form-control" name="email" value="<%= user.getEmail()%>" id="lastname" placeholder="Enter last name">
                                        </div>
                                    </div> <!-- end col -->
                                    <div class="col-md-6">
                                        <div class="mb-3">
                                            <label for="lastname" class="form-label">Mobile No</label>
                                            <input type="text" class="form-control" name="phone" value="<%= user.getPhone()%>" id="lastname" placeholder="Enter last name">
                                        </div>
                                    </div> <!-- end col -->
                                    <div class="col-md-6">
                                        <div class="mb-3">
                                            <label for="emailaddress" class="form-label">Select Your Branch</label>
                                            <select class="form-control" name="branch" required>
                                                <option selected value="<%= user.getBranch()%>"><%= user.getBranch()%></option>
                                                <option value="civil">CIVIL ENGINEERING</option>
                                                <option value="computer">COMPUTER SCIENCE & ENGINEERING</option>
                                                <option value="electrical">ELECTRICAL ENGINEERING</option>
                                                <option value="electronics">ELECTRONICS & TELECOMMUNICATION ENGINEERING</option>
                                                <option value="mechanical">MECHANICAL ENGINEERING</option>
                                            </select>
                                        </div>
                                    </div> <!-- end col -->
                                    <div class="col-md-6">
                                        <div class="mb-3">
                                            <label for="degree" class="form-label">Degree</label>
                                            <input type="text" class="form-control" name="degree"  placeholder="Enter Degree" required>
                                        </div>
                                    </div> <!-- end col -->
                                    <div class="col-md-6">
                                        <div class="mb-3">
                                            <label for="phonenumber" class="form-label">Select Passout Year</label>
                                            <select class="form-control" id="ddlYearss" name="passYear" required="">
                                                <option selected=""  value="<%= user.getPassoutYear()%>"><%= user.getPassoutYear()%></option>
                                                <option value="Pursuing">Pursuing</option>
                                            </select>
                                        </div>
                                    </div> <!-- end col -->
                                </div> <!-- end row -->

                                <div class="text-end">
                                    <button type="submit" class="btn btn-success mt-2"><i class="mdi mdi-content-save"></i> Update </button>
                                </div>
                            </form>
                            <%} else {%>
                            <h5 class="mb-3 mt-3 text-uppercase bg-primary  text-white p-2"><i class="mdi mdi-office-building me-1"></i>Update your Job Details</h5>
                            <%
                                JobController jobController = new JobController();
                                JobModel jobModel = jobController.selectByUserId(id);
                                
                            %>
                            <div class="row">
                                <!--<div class="col-md-6">-->
                                <form  class="needs-validation" novalidate action="JobController" method="post">
                                    <input type="hidden" name="action" value="update">
                                    <input type="hidden" name="userId" value="<%= request.getParameter("userId") %>">
                                    <!--  <input type="hidden" name="userId" value="insert">-->

                                    <div class="col-12">
                                        <label class="form-label" for="validationCustom01">Company</label>
                                        <input type="text" class="form-control" id="validationCustom01" name="company" value="<%= jobModel.getCompany() %>" placeholder="enter company name" required>
                                        <div class="valid-feedback">
                                            Looks good!
                                        </div>
                                    </div>
                                    <div class="row mt-2">
                                        <div class="col-6">
                                            <label for="companyname" class="form-label">Lpa</label>
                                            <input type="text" class="form-control" id="lpa" name="lpa" value="<%= jobModel.getLpa() %>" placeholder="enter lpa">
                                        </div>  

                                        <div class="col-6">
                                            <label for="cwebsite" class="form-label">Designation</label>
                                            <input type="text" class="form-control" id="designation" name="designation" value="<%= jobModel.getDesignation()%>" placeholder="enter designation ">
                                        </div>
                                    </div>
                                    <div class="text-end">
                                        <button type="submit" class="btn btn-success mt-2 mb-2"><i class="mdi mdi-content-save"></i> Save</button>
                                    </div>
                                    <!-- end col -->
                                </form>

                             
                            </div>
                            <%}%>
                        </div>
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
            <script type="text/javascript">
                window.onload = function () {
                    //Reference the DropDownList.
                    var ddlYearss = document.getElementById("ddlYearss");

                    //Determine the Current Year.
                    var currentYears = (new Date()).getFullYear();

                    //Loop and add the Year values to DropDownList.
                    for (var i = 1950; i <= currentYears; i++) {
                        var option = document.createElement("OPTION");
                        option.innerHTML = i;
                        option.value = i;
                        ddlYearss.appendChild(option);
                    }
                };
            </script>
    </body>

</html> 