<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>CMS - Edit Customer</title>
    <jsp:include page="menubar.jsp"></jsp:include>
</head>

<!-- Begin Page Content -->
<div class="container-fluid">
    <!-- Page Heading -->
    <h1 class="h3 mb-0 text-gray-800">Edit Customer </h1>
    <p class="mb-4">Edit your customer accounts here</p>
    <hr><br>

    <div class="container-fluid">

        <body class="bg-gradient-primary">

            <div class="container">

                <!-- Outer Row -->
                <div class="row justify-content-center">

                    <div class="col-xl-10 col-lg-12 col-md-9">

                        <div class="card o-hidden border-0 shadow-lg my-5">
                            <div class="card-body p-0">
                                <!-- Nested Row within Card Body -->
                                <div class="row">
                                    <!--            //dog image here-->
                                    <!--            <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>-->
                                    <div class="col-lg-2"></div>
                                    <div class="col-lg-8">
                                        <div class="p-5">
                                            <div class="text-center">
                                                <h1 class="h4 text-gray-900 mb-4"><strong>Edit Customer</strong></h1>
                                            </div>
                                            <div class="card-body card shadow mb-8" >
                                            <c:forEach var="customer" items="${customer}">
                                                <form class="user" action="/registercustomer" method="post">

                                                    <div class="form-group">
                                                        <input type="text" class="form-control form-control-user" name="firstname"
                                                               placeholder="${customer.firstName }" >${customer.firstName }
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="text" class="form-control form-control-user" name="lastname"
                                                               placeholder="${customer.lastName }" >
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="number" class="form-control form-control-user"name="phoneno"
                                                               placeholder="${customer.phoneNo}"  >
                                                    </div>

                                                    <div class="form-group">
                                                        <input type="text" class="form-control form-control-user"name="address"
                                                               placeholder="${customer.address}" >
                                                    </div>
                                                    <div class="form-group" >
                                                        <input type="text" class="form-control form-control-user"name="email"
                                                               placeholder="${customer.email}" >
                                                    </div>
                                                    <div class="form-group" >
                                                    <label> (Select your Packageamount)</label>
                                                        <select class="form-control "form-control-user  name="packageamount" selected="${customer.packageAmount}">
                                                            <option>200</option>
                                                            <option>400</option>
                                                            <option>600</option>

                                                        </select>
                                                    </div>

                                                    <div class="form-group" border-radius: 25px;>
                                                    <label> (Select your Area)</label>
                                                        <select class="form-control "form-control-user  name="area" selected="${customer.area}">
                                                            <option>Gandhibag</option>
                                                            <option>Mahal</option>
                                                            <option>Sadar</option>
                                                        </select>
                                                    </div>

                                                    <div class="form-group">
                                                        <input type="text" class="form-control form-control-user" name="balance"
                                                               placeholder="${customer.balance}" >
                                                    </div>

                                                     <div class="form-group" >
                                                        <input type="text"  class="form-control form-control-user" name="setupboxno"
                                                               placeholder="${customer.setupBoxNo}" >
                                                    </div>

                                                    <div class="form-group" border-radius: 25px;>
                                                    <label> (Status)</label>
                                                        <select class="form-control "form-control-user  name="status" selected="${customer.status}">
                                                            <option>Active</option>
                                                            <option>Inactive</option>
                                                        </select>
                                                    </div>

                                                    <input type="submit" value="Edit Customer" class="btn btn-primary btn-user btn-block">
                                                    <input type="submit" value="Delete Customer" class="btn btn-primary btn-user btn-block">
                                                </c:forEach>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Bootstrap core JavaScript-->
            <script src="vendor/jquery/jquery.min.js"></script>
            <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

            <!-- Core plugin JavaScript-->
            <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

            <!-- Custom scripts for all pages-->
            <script src="js/sb-admin-2.min.js"></script>
        </div>
    </div>
</div>
</div>
<!-- Bootstrap core JavaScript - for search and master expand-->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Custom scripts for all pages - for side bar minimize-->
<script src="js/sb-admin-2.min.js"></script>
</body>

</html>