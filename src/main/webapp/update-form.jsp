
<%@page import="com.qaswatech.alumni.model.UserModel"%>
<%@page import="com.qaswatech.alumni.controller.UserController"%>
<%
    String id = request.getParameter("user_id");
    String pageForm = request.getParameter("page");
    UserController controller = new UserController();

%>
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

<% if (pageForm.equals("personal")) {
        UserModel user = controller.findByUserId(id);
%>
<form action="UserImageController" method="post" enctype="multipart/form-data">
    <input type="hidden" name="action" value="update">
    <input type="hidden" name="userId" value="<%= user.getUserId()%>">
    <h5 class="mb-4 text-uppercase bg-light p-2"><i class="mdi mdi-account-circle me-1"></i> Personal Info</h5>
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
                </select>
            </div>
        </div> <!-- end col -->
    </div> <!-- end row -->

    <div class="text-end">
        <button type="submit" class="btn btn-success mt-2"><i class="mdi mdi-content-save"></i> Update </button>
    </div>
</form>
<%} else {%>
<h1>gg</h1>
<%}%>
