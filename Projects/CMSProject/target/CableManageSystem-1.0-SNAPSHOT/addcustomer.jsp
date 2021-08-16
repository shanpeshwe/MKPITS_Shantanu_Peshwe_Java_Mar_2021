<head>
    <title>CMS - Add Customer</title>
    <jsp:include page="menubar.html"></jsp:include> 
</head>

<!-- Begin Page Content -->
<div class="container-fluid">
    <!-- Page Heading -->
    <h1 class="h3 mb-0 text-gray-800"> Add New Customer </h1>
    <p class="mb-4">Add your new customer accounts here</p>
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
                                                <h1 class="h4 text-gray-900 mb-4"><strong>Add Your New Customer</strong></h1>
                                            </div>
                                            <div class="card-body card shadow mb-8" >
                                                <form class="user">
                                                    <div class="form-group" >
                                                        <input type="text" style="align:center" class="form-control form-control-user"

                                                               placeholder="Set-top Boxno." required>
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="text" class="form-control form-control-user"
                                                               placeholder="First Name" required>
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="text" class="form-control form-control-user"
                                                               placeholder="Last Name" >
                                                    </div>
                                                    <div class="form-group">
                                                        <input type="number" class="form-control form-control-user"
                                                               placeholder="Phone Number" required >
                                                    </div>

                                                    <div class="form-group">
                                                        <input type="text" class="form-control form-control-user"
                                                               placeholder="Address">
                                                    </div>
                                                    <div class="form-group" >
                                                        <input type="text" class="form-control form-control-user"
                                                               placeholder="Email">
                                                    </div>
                                                    <div class="form-group" >

                                                        <!--                            <label>State (Select your State)</label>-->
                                                        <select class="form-control "form-control-user   >
                                                            <option>Silver</option>
                                                            <option>Gold</option>
                                                            <option>Platinium</option>

                                                        </select>
                                                    </div>

                                                    <div class="form-group" border-radius: 25px;>

                                                        <!--                            <label>State (Select your State)</label>-->
                                                        <select class="form-control "form-control-user  >
                                                            <option>Gandhibag</option>
                                                            <option>Mahal</option>
                                                            <option>Sadar</option>
                                                        </select>
                                                    </div>
                                                    <input type="submit" value="Add Customer" class="btn btn-primary btn-user btn-block">
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