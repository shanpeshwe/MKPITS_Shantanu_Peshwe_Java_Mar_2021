<head>
 <jsp:include page="menubar.html"></jsp:include> 
</head>

            <!-- Begin Page Content -->
            <div class="container-fluid">
                <!-- Page Heading -->
                <h1 class="h3 mb-0 text-gray-800">Search Active Connection</h1>
                <p class="mb-4">Manage your active connections here</p>
                <hr>
                <div class="card-body card shadow mb-4">
                    <form>
                        <!-- Row 1 -->
                        <div class="form-group row">
                            <label class="col-sm-2 col-form-label">By STB number :</label>
                            <div class="col-sm-3">
                                <input class="form-control" id="stbnumber" placeholder="Enter STB number">
                            </div>
                            <label class="col-sm-2 col-form-label">By Customer name :</label>
                            <div class="col-sm-3">
                                <input class="form-control" id="customername" placeholder="Enter name">
                            </div>
                            <div class="col-sm-2">
                            <button type="submit" class="btn btn-primary">Submit</button>
                            </div>
                        </div>
                    </form>
                </div>
                <hr>
                <!-- DataTales Example -->
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">Active Connections</h6>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                <thead>
                                <tr>
                                    <th>STB No.</th>
                                    <th>Customer Name</th>
                                    <th>Edit</th>
                                    <th>Disconnect</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>A123BC342D</td>
                                    <td>Tiger Nixon</td>
                                    <td><a href="#">Edit</a></td>
                                    <td><a href="#">Disconnect</a></td>
                                </tr>
                                <tr>
                                    <td>A123BC343C</td>
                                    <td>Cedric Kelly</td>
                                    <td><a href="#">Edit</a></td>
                                    <td><a href="#">Disconnect</a></td>
                                </tr>
                                <tr>
                                    <td>A123BC344B</td>
                                    <td>Ashton Cox</td>
                                    <td><a href="#">Edit</a></td>
                                    <td><a href="#">Disconnect</a></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- End of Main Content -->

    </div>
    <!-- End of Content Wrapper -->

</div>
<!-- End of Page Wrapper -->

<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
</a>

<!-- Bootstrap core JavaScript-->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="vendor/datatables/jquery.dataTables.min.js"></script>
<script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

<!-- Page level custom scripts -->
<script src="js/demo/datatables-demo.js"></script>

</body>

</html>