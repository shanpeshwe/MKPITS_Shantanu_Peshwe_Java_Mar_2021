<head>
    <title>CMS - Make Receipt</title>
    <jsp:include page="menubar.jsp"></jsp:include> 
</head>


<!-- End of Topbar -->

<!-- Begin Page Content -->
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
                                            <h1 class="h4 text-gray-900 mb-4"><strong>Generate Your Receipt</strong></h1>
                                        </div>
                                        <div class="card-body card shadow mb-6" >
                                            <form class="user">
                                                <div class="form-group" >
                                                    <input type="text" style="align:center" class="form-control form-control-user"

                                                           placeholder="Enter your Name">
                                                </div>
                                                <div class="form-group">
                                                    <input type="number" class="form-control form-control-user"
                                                           placeholder="Balance" disabled>
                                                </div>
                                                <div class="form-group">
                                                    <input type="number" class="form-control form-control-user"
                                                           placeholder="Amount">
                                                </div>
                                                <div class="form-group">
                                                    <input type="datetime-local" class="form-control form-control-user"
                                                           placeholder="Date">
                                                </div>
                                                <!--                  <div class="form-group">-->
                                                <!--                    <div class="custom-control custom-checkbox small">-->
                                                <!--                      <input type="checkbox" class="custom-control-input" id="customCheck">-->
                                                <!--                      <label class="custom-control-label" for="customCheck">Remember-->
                                                <!--                        Me</label>-->
                                                <!--                    </div>-->
                                                <!--                  </div>-->
                                                <br> <a href="index.html" class="btn btn-primary btn-user btn-block">
                                                    Generate Receipt
                                                </a>
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