<%-- 
    Document   : index
    Created on : 16-Nov-2022, 10:53:47 PM
    Author     : Amit
--%>

<%@page import="com.qaswatech.alumni.utilities.Utils"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.qaswatech.alumni.model.PostModel"%>
<%@page import="com.qaswatech.alumni.controller.PostController"%>
<%@page import="javax.annotation.PostConstruct"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" data-theme="light" data-layout="topnav" data-topbar-color="dark" data-layout-mode="fluid" data-layout-position="fixed">


    <head>
        <meta charset="utf-8" />
        <title>Alumni | Feeds</title>
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
                    <!-- start news feeds -->
                    <%
                        PostController postController = new PostController();
                        ArrayList<PostModel> posts = postController.findAll();
                    %>
                    <div class="container">
                        <% if (posts.isEmpty()) { %>
                        <h5>No Post Found</h5>
                        <% } else {
                            for (PostModel post : posts) {
                                UserController userController1 = new UserController();
                                UserModel user = userController1.findByUserId(post.getUserId());
                        %>
                        <div class="card mt-2">
                            <div class="card-body pb-1">
                                <a href="user-profile.jsp?id=<%= user.getUserId() %>">
                                <div class="d-flex mb-2">
                                    <% if (Utils.empty(user.getProfile())) {%>
                                    <img class="me-2 rounded" src="assets/images/users/user.png" alt="Profile" height="32">
                                    <%} else {%>
                                    <img class="me-2 rounded" src="<%= user.getProfile()%>" alt="Profile" height="32">
                                    <%} %>
                                    <div class="w-100">
                                        <h5 class="m-0 mt-1" ><%= user.getName()%></h5>
                                        <span class="offset-lg-11 mt-sm-2"><%= post.getCreatedAt().substring(0, 10)%></span>
                                    </div>
                                </div>
                                </a>
                                <hr class="m-0" />
                                <h3><%= post.getTitle()%></h3>
                                <div class="font-16 text-dark my-3">
                                    <%= post.getDescription()%>
                                </div>
                                <hr class="m-0" />
                                <hr class="m-0" />
                            </div> <!-- end card-body -->
                        </div> 
                        <% }
                            }%>
                    </div>
                    <!-- end news feeds -->
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