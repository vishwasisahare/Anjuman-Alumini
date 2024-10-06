<%@page import="com.qaswatech.alumni.model.UserModel"%>
<%@page import="com.qaswatech.alumni.controller.UserController"%>
<%
    if (session.getAttribute("Id") == "null" || session.getAttribute("Id") == null) {
        response.sendRedirect("login.jsp?message=Please Login First");
    }
%>
<!-- ========== Topbar Start ========== -->
<div class="navbar-custom topnav-navbar">
    <div class="container-fluid detached-nav">
        <%
            UserController userController = new UserController();
            UserModel userModel = userController.findByUserId(session.getAttribute("Id").toString());
        %>

        <!-- Topbar Logo -->
        
        <!-- Horizontal Menu Toggle Button -->
        <button class="navbar-toggle" data-bs-toggle="collapse" data-bs-target="#topnav-menu-content">
            <div class="lines">
                <span></span>
                <span></span>
                <span></span>
            </div>
        </button>
        <div class="logo-topbar">
            <!-- Logo light -->
            <div class="mt-3">
            <a href="feeds.jsp" class="logo-light">
                <h2 style="color: white; font-family: initial">Anjuman Alumni</h2>
<!--                <h1 style="color: white; font-family: initial">St. John's Alumni</h1>-->
            </a>
            </div>
            <!-- Logo Dark -->
            <a href="index.jsp" class="logo-dark">
                <span class="logo-lg">
                    <img src="assets/images/logo-dark.png" alt="dark logo" height="22">
                </span>
                <span class="logo-sm">
                    <img src="assets/images/logo-dark-sm.png" alt="small logo" height="22">
                </span>
            </a>
        </div>
        <ul class="list-unstyled topbar-menu float-end mb-0">
            <li class="notification-list d-none d-sm-inline-block">
                <a class="nav-link" href="javascript:void(0)" id="light-dark-mode">
                    <i class="ri-moon-line noti-icon"></i>
                </a>
            </li>

            <li class="notification-list d-none d-md-inline-block">
                <a class="nav-link" href="#" data-toggle="fullscreen">
                    <i class="ri-fullscreen-line noti-icon"></i>
                </a>
            </li>

            <li class="dropdown notification-list">
                <a class="nav-link dropdown-toggle nav-user arrow-none me-0" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="false"
                   aria-expanded="false">
                     <% if (userModel.getProfile()== "null" || userModel.getProfile() == "" || userModel.getProfile() == null) {%>
                    <span class="account-user-avatar"> 
                        <img src="assets/images/users/user.png" alt="user-image" class="rounded-circle">
                    </span>
                     <%} else {%>
                      <span class="account-user-avatar"> 
                        <img src="<%= userModel.getProfile() %>" alt="user-image" class="rounded-circle">
                    </span>
                     <%}%>
                    <span>
                        <span class="account-user-name mt-2"><%= session.getAttribute("Name")%></span>
                    </span>
                    
                </a>
                <div class="dropdown-menu dropdown-menu-end dropdown-menu-animated topbar-dropdown-menu profile-dropdown">
                    <!-- item-->
                    <a href="AlumniController?action=logout" class="dropdown-item notify-item">
                        <i class="mdi mdi-logout me-1"></i>
                        <span>Logout</span>
                    </a>

                </div>
            </li>
        </ul>
    </div>
</div>
<!-- ========== Topbar End ========== -->

<!-- ========== Horizontal Menu Start ========== -->
<div class="topnav topnav-light shadow-sm">
    <div class="container-fluid">
        <nav class="navbar navbar-light navbar-expand-lg topnav-menu">
            <div class="collapse navbar-collapse" id="topnav-menu-content">
                <ul class="navbar-nav">

                    <li class="nav-item dropdown">
                        <a class="nav-link " href="feeds.jsp" id="topnav-layouts" role="button">
                            <i class="uil-window me-1"></i>Feeds <div class=""></div>
                        </a>
                    </li>
                    <% if (!(userModel.getUserType().equals("student"))) {%>
                    <li class="nav-item dropdown">
                        <a class="nav-link " href="dashboard.jsp" id="topnav-layouts" role="button">
                            <i class="uil-window me-1"></i>Post <div class=""></div>
                        </a>
                    </li>
                      <%}%>
                    <li class="nav-item dropdown">
                        <a class="nav-link " href="https://meet.google.com/" target="_blank" id="topnav-layouts" role="button">
                            <i class="uil-window me-1"></i>Google Meet<div class=""></div>
                        </a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link " href="https://zoom.us/signin#/login"  target="_blank" id="topnav-layouts" role="button">
                            <i class="uil-window me-1"></i>Zoom Meeting <div class=""></div>
                        </a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link " href="profile-page.jsp" id="topnav-layouts" role="button">
                            <i class="uil-window me-1"></i>Profile <div class=""></div>
                        </a>
                    </li>
                    <div class="dropdown notification-list">
                    <li class="nav-item dropdown">
                        <a class="nav-link" href="UserController?action=logout" id="topnav-layouts" role="button">
                            <i class="uil-lock me-1"></i>Logout<div class=""></div>
                        </a>
                    </li>
                    </div>
                </ul>
            </div>
        </nav>
    </div>
</div>
<!-- ========== Horizontal Menu End ========== -->