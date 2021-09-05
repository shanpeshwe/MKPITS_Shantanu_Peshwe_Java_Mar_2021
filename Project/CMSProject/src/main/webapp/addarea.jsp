<head>
    <title>CMS - Add Area</title>
 <jsp:include page="menubar.jsp"></jsp:include> 
</head>

<!-- Begin Page Content -->
            <div class="container-fluid">
                <!-- Page Heading -->
                <h1 class="h3 mb-0 text-gray-800">Customer Area Info</h1>
                <p class="mb-4">Manage your customer area information here</p>
                <hr><br>
                <div class="card-body card shadow mb-4">
                    <form>
                        <!-- Row 1 -->
                        <div class="form-group row">
                            <label class="col-sm-2 col-form-label">By Area Name :</label>
                            <div class="col-sm-3">
                                <input class="form-control" id="stbnumber" placeholder="Enter Area Name">
                            </div>
                            <div class="col-sm-2">
                            <button type="submit" class="btn btn-primary">Add Area</button>
                            </div>
                        </div>
                    </form>
                </div>
                <hr>
                
   
                <br><br><br><h3 class="m-0 font-weight-bold text-primary">Customer Area List</h3><br>

            </div>
    <div class="card-body card shadow mb-4">
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered text-center" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                    <tr>
                        <th>Area Name</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>

                    <tbody >

                        <tr>
                            <td>Dharampeth</td>
                            <td><a href="#">Edit</a></td>
                            <td><a href="#">Delete</a></td>
                        </tr>

                        <tr>
                            <td>Ramdespeth</td>
                            <td><a href="#">Edit</a></td>
                            <td><a href="#">Delete</a></td>
                        </tr>

                        <tr>
                            <td>Hanuman Nagar</td>
                            <td><a href="#">Edit</a></td>
                            <td><a href="#">Delete</a></td>
                        </tr>
                    </tbody>
                </table>
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


    <!-- Bootstrap core JavaScript - for search and master expand-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Custom scripts for all pages - for side bar minimize-->
    <script src="js/sb-admin-2.min.js"></script>

</html>