<%-- 
    Document   : index
    Created on : 16-Nov-2022, 10:53:47 PM
    Author     : Amit
--%>

<%@page import="com.qaswatech.alumni.model.SocialModel"%>
<%@page import="com.qaswatech.alumni.controller.SocialController"%>
<%@page import="com.qaswatech.alumni.dao.JobDao"%>
<%@page import="com.qaswatech.alumni.model.JobModel"%>
<%@page import="javax.print.attribute.standard.JobMediaSheets"%>
<%@page import="com.qaswatech.alumni.controller.JobController"%>
<%@page import="com.qaswatech.alumni.utilities.Utils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" data-theme="light" data-layout="topnav" data-topbar-color="dark" data-layout-mode="fluid" data-layout-position="fixed">


    <head>
        <meta charset="utf-8" />
        <title>Alumni | User Profile</title>
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
                    <%
                        UserController controller = new UserController();
                        UserModel user = controller.findByUserId(request.getParameter("id"));

                    %>
                    <div class="container">
                        <div class="row mt-3">
                            <div class="col-lg-6 offset-lg-3 col-sm-12">
                                <!-- Profile -->
                                <div class="card bg-primary">
                                    <div class="card-body profile-user-box">
                                        <div class="card-body text-center">
                                            <% if (Utils.empty(user.getProfile())) {%>
                                            <img src="assets/images/users/user.png" alt="" class="rounded-circle img-thumbnail" width="120px" height="120px">
                                            <% } else {%>
                                            <img src="<%= user.getProfile()%>" class="rounded-circle img-thumbnail" width="120px" height="120px">
                                            <% }%>
                                            <div class="table-responsive-sm mt-3">
                                                <table class="table text-center text-white">
                                                    <tr class="text-center table-info">
                                                        <td colspan="2"><b>Personal Details</b></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Name</td>
                                                        <td><%= user.getName()%></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Email</td>
                                                        <td><%= user.getEmail()%></td>
                                                    </tr>
                                                    <% if (!(Utils.empty(user.getBranch()))) {%>
                                                    <tr>
                                                        <td>Branch</td>
                                                        <td><%= user.getBranch()%></td>
                                                    </tr>
                                                    <%}
                                                        if (!(Utils.empty(user.getBranch()))) {%>
                                                    <tr>
                                                        <td>Degree</td>
                                                        <td><%= user.getDegree()%></td>
                                                    </tr>
                                                    <%}
                                                        JobDao jd = new JobDao();

                                                        if ((jd.getJobCountById(user.getUserId())) == 1) {
                                                            JobController jobController = new JobController();
                                                            JobModel job = jobController.selectByUserId(user.getUserId());
                                                   if (user.getUserType().equals("staff")) {
                                                    %>
                                                    <tr class="text-center table-info">
                                                        <td colspan="2"><b>Staff Details</b></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Department</td>
                                                        <td><%= job.getCompany()%></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Designation</td>
                                                        <td><%= job.getDesignation()%></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Experience</td>
                                                        <td><%= job.getLpa()%></td>
                                                    </tr>
                                                    <%} else {%>
                                                    <tr class="text-center table-info">
                                                        <td colspan="2"><b>Job Details</b></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Company</td>
                                                        <td><%= job.getCompany()%></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Designation</td>
                                                        <td><%= job.getDesignation()%></td>
                                                    </tr>
                                                    <tr>
                                                        <td>LPA</td>
                                                        <td><%= job.getLpa()%></td>
                                                    </tr>
                                                    <%}
                                                        }
                                                        SocialController socialController = new SocialController();
                                                        SocialModel socialModel = socialController.findByUserId(user.getUserId());
                                                        if (!(socialModel == null)){
                                                    %>
                                                    <tr class="text-center table-info" >
                                                        <td colspan="2"><b>Social Links</b></td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="2">
                                                            <a href="<%= socialModel.getFacebook()%>" target="_blank"><i class="ri-facebook-line text-white" style="font-size: 30px"></i></a>&nbsp;&nbsp;
                                                            <a href="<%= socialModel.getInstagram()%>" target="_blank"><i class="ri-instagram-line text-white" style="font-size: 30px"></i></a>&nbsp;&nbsp;
                                                            <a href="<%= socialModel.getLinkedin()%>" target="_blank"><i class="ri-linkedin-line text-white" style="font-size: 30px"></i></a>&nbsp;&nbsp;
                                                            <% if(!(socialModel.getTwitter().isEmpty())){ %>
                                                            <a href="<%= socialModel.getTwitter()%>" target="_blank"><i class="ri-twitter-line text-white" style="font-size: 30px"></i></a>
                                                            <%}%>
                                                        </td>
                                                    </tr>
                                                    <%}%>
                                                </table>
                                            </div>
                                        </div>
                                    </div> <!-- end card-body/ profile-user-box-->
                                </div><!--end profile/ card -->
                            </div> <!-- end col-->
                        </div>
                        <!-- end row -->
                        <!-- container -->
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

    </body>

</html> 