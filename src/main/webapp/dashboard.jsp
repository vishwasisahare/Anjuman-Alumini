<%-- 
    Document   : dashboard
    Created on : 16-Dec-2022, 4:14:34 PM
    Author     : Amit
--%>

<%@page import="com.qaswatech.alumni.utilities.Utils"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.qaswatech.alumni.model.PostModel"%>
<%@page import="com.qaswatech.alumni.controller.PostController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" data-theme="light" data-layout="topnav" data-topbar-color="dark" data-layout-mode="fluid" data-layout-position="fixed">


    <head>
        <meta charset="utf-8" />
        <title>Alumni | Post</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <%@include file="links.jsp" %>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.9/summernote-bs4.css" rel="stylesheet">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.9/summernote-bs4.js"></script>
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
                    <div class="container-xxl">
                        <div class="row mt-3">
                            <div class="col-lg-9">
                                <!-- new post -->
                                <div class="card">
                                    <!------------------------------------------------post start---------------------------------->

                                    <ul class="list-group list-group-flush">
                                        <li class="list-group-item">
                                            <div class="mb-2">
                                                <h4 class="header-title mt-2">Create Post</h4>
                                                <ul class="nav nav-tabs nav-bordered mb-3">
                                                </ul> <!-- end nav-->
                                                <form action="PostController" method="post">
                                                    <input type="hidden" name="action" value="insert">
                                                    <input type="hidden" name="userId" value="<%= session.getAttribute("Id")%>">
                                                    <label>Post Title</label>
                                                    <input type="text" name="title" class="form-control mb-2" required placeholder="Enter Post Title">
                                                    <div class="form-group">
                                                        <textarea id="summernote" name="description"></textarea>
                                                    </div>
                                                    <div class="p-2 bg-light d-flex" style="justify-content:flex-end">
                                                        <button type="submit"  class="btn btn-sm btn-dark waves-effect">Post</button>
                                                    </div>
                                                </form>
                                            </div>
                                        </li>
                                    </ul> <!-- end list-->
                                </div> <!-- end card-->

                                <!-----------------------------post end--------------------->
                                <!-- end new post -->

                                <!-- start news feeds -->
                                <%
                                    PostController postController = new PostController();
                                    ArrayList<PostModel> postsModels = postController.findAllByUserId(session.getAttribute("Id").toString());
                                    UserController userController1 = new UserController();
                                    UserModel uModel = userController1.findByUserId(session.getAttribute("Id").toString());

                                %>
                                <%  if (postsModels.isEmpty()) { %>
                                <div class="card">
                                    <div class="card-body pb-1">
                                        <h5>No Post Found</h5>
                                    </div>
                                </div>
                                <% } else {
                                    for (PostModel post : postsModels) {
                                %>
                                <div class="card">
                                    <div class="card-body pb-1">
                                        <div class=" mb-2">
                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <div class="d-flex mb-2">
                                                        <% if (Utils.empty(uModel.getProfile())) {%>
                                                        <img class="me-2 rounded" src="assets/images/users/user.png" alt="Profile" height="32">
                                                        <%} else {%>
                                                        <img class="me-2 rounded" src="<%= uModel.getProfile()%>" alt="Profile" height="32">
                                                        <%}%>
                                                        <div class="w-100">
                                                            <h5 class="m-0 mt-1" ><%= uModel.getName()%></h5>
                                                            <span class=" mt-sm-2">Posted on : <%= post.getCreatedAt().substring(0, 10)%></span>
                                                        </div>
                                                        <a href="PostController?action=delete&id=<%= post.getPostId()%>" class="text-danger text-end"><i class="ri-delete-bin-6-line" style="font-size: 20px"></i></a>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
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
                                    }
                                %>
                                <!-- end news feeds -->

                                <!-- loader -->
                                <div class="text-center mb-3">
                                    <a href="javascript:void(0);" class="text-danger"><i class="mdi mdi-spin mdi-loading me-1 font-16"></i> Load more </a>
                                </div>
                                <!-- end loader -->
                            </div>
                            <div class="col-lg-3">
                                <!-- start profile info -->
                                <div class="card">
                                    <div class="card-body">
                                        <img src="assets/images/alumni2.jpg" class="img-fluid mt-2" >
                                    </div>
                                </div>
                                <!-- end profile info -->
                            </div> <!-- end col -->

                        </div> <!--end row -->

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
            <script>
                $('textarea#summernote').summernote({
                    placeholder: 'Hello bootstrap 4',
                    tabsize: 2,
                    height: 100,
                    toolbar: [
                        ['style', ['style']],
                        ['font', ['bold', 'italic', 'underline', 'clear']],
                        // ['font', ['bold', 'italic', 'underline', 'strikethrough', 'superscript', 'subscript', 'clear']],
                        //['fontname', ['fontname']],
                        // ['fontsize', ['fontsize']],
                        ['color', ['color']],
                        ['para', ['ul', 'ol', 'paragraph']],
                        ['height', ['height']],
                        ['table', ['table']],
                        ['insert', ['link', 'picture', 'hr']],
                        //['view', ['fullscreen', 'codeview']],
                        ['help', ['help']]
                    ],
                });
            </script>            
            <%@include file="scripts.jsp" %>
    </body>

</html> 
