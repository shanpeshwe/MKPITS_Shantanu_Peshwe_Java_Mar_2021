
<head>
    <title>CMS - Receipt</title>

    <jsp:include page="menubar.jsp"></jsp:include> 

</head>

<!-- End of Topbar -->

<!-- Begin Page Content -->


<div class="container-fluid">
    <!-- Page Heading -->
    <h1 class="h3 mb-0 text-gray-800">Search Receipts</h1>
    <p class="mb-4">Manage your customer Receipts transaction here</p>
    <hr><br>
    <div class="card-body card shadow mb-4">
        <form>
            <!-- Row 1 -->
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">First Name :</label>
                <div class="col-sm-3">
                    <input class="form-control" id="stbnumber" placeholder="Enter First Name">
                </div>
                <label class="col-sm-2 col-form-label">Last Name :</label>
                <div class="col-sm-3">
                    <input class="form-control" id="customername" placeholder="Enter Last Name">
                </div>
                <div class="col-sm-2">
                    <button type="submit" class="btn btn-primary">Search</button>
                </div>
            </div>

            <br>    <div class="form-group row">
                <label class="col-sm-2 col-form-label">From Date :</label>
                <div class="col-sm-3">
                    <input type="date" name="date">
                </div>
                <label class="col-sm-2 col-form-label">To Date :</label>
                <div class="col-sm-3">
                    <input type="date" name="date">
                </div>
            </div>
        </form>
    </div>
    <!--         Name : <input type="text" name="text" >
            <input type="button" class=" btn-primary " name="submit"value="Search" color="success" ></input><hr>-->

    <!--<input type="button" class=" btn-primary " name="submit"value="Make Receipt" color="primary" ></input>-->

    <!--    <div class="card-body">
            <div class="table-responsive">
    
                <table class="table table-bordered"  width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>From Date:</th>
                    <input type="date" name="date" />
                    <th>To Date:</th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="date" name="date" />
                    </tr>
                    </thead>
                </table>
            </div>
        </div>-->


    <!--    <input type="button" class=" btn-success " name="submit"value="Search" color="success" ></input><br><hr>-->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h4 class="m-0 font-weight-bold text-primary">Search Customer Payment Receipt</h4>
        </div>
        <div class="card-body">

            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Receipt No.</th>
                            <th>Date</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Balance Amount</th>
                            <!--                <th>View</th>-->
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>1</td>
                            <td>01-08-21</td>
                            <td>Amit</td>
                            <td>Sharma</td>
                            <td>500</td>
                            <!--                <td><a href="#">
                                      <span class="glyphicon glyphicon-eye-open"></span>
                                    </a></td>-->
                            <td><a href="#">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
                                    <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
                                    <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
                                    </svg></a><a href="#">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a></td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>02-08-21</td>
                            <td>Ravi</td>
                            <td>Shastri</td>
                            <td>100</td>
                            <!--                <td><a href="#">
                                      <span class="glyphicon glyphicon-eye-open"></span>
                                    </a></td>-->
                            <td><a href="#">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
                                    <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
                                    <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
                                    </svg></a><a href="#">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a></td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>05-08-21</td>
                            <td>Arjun</td>
                            <td>Verma</td>
                            <td>400</td>
                            <!--                <td><a href="#">
                                      <span class="glyphicon glyphicon-eye-open"></span>
                                    </a></td>-->
                            <td><a href="#">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
                                    <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
                                    <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
                                    </svg></a><a href="#">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a></td>
                        </tr>
                        <tr>
                            <td>4</td>
                            <td>08-08-21</td>
                            <td>Karan</td>
                            <td>Joshi</td>
                            <td>900</td>
                            <!--                <td><a href="#">
                                      <span class="glyphicon glyphicon-eye-open"></span>
                                    </a></td>-->
                            <td><a href="#">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
                                    <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
                                    <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
                                    </svg></a><a href="#">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a></td>
                        </tr>
                        <tr>
                            <td>5</td>
                            <td>09-08-21</td>
                            <td>dilip</td>
                            <td>Rai</td>
                            <td>600</td>
                            <!--                <td><a href="#">
                                      <span class="glyphicon glyphicon-eye-open"></span>
                                    </a></td>-->
                            <td><a href="#">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
                                    <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
                                    <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
                                    </svg></a><a href="#">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>

                    </tbody>
                </table>
            </div>
        </div>

        <!--            <div class="table-responsive">
                        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                            <thead>
                                <tr>
                                    <th>Receipt No.</th>
                                    <th>Date</th>
                                    <th>First Name</th>
                                    <th>Last Name</th>
                                    <th>Balance Amount</th>
                                    <th>View</th>
                                    <th>Delete</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>01-08-21</td>
                                    <td>Amit</td>
                                    <td>Sharma</td>
                                    <td>500</td>
                                    <td>View</td>
                                    <td><a href="#">Delete</a></td>
                                </tr>
                                <tr>
                                    <td>2</td>
                                    <td>02-08-21</td>
                                    <td>Ravi</td>
                                    <td>Shastri</td>
                                    <td>100</td>
                                    <td>View</td>
                                    <td><a href="#">Delete</a></td>
                                </tr>
                                <tr>
                                    <td>3</td>
                                    <td>05-08-21</td>
                                    <td>Arjun</td>
                                    <td>Verma</td>
                                    <td>400</td>
                                    <td>View</td>
                                    <td><a href="#">Delete</a></td>
                                </tr>
                                <tr>
                                    <td>4</td>
                                    <td>08-08-21</td>
                                    <td>Karan</td>
                                    <td>Joshi</td>
                                    <td>900</td>
                                    <td>View</td>
                                    <td><a href="#">Delete</a></td>
                                </tr>
                                <tr>
                                    <td>5</td>
                                    <td>09-08-21</td>
                                    <td>dilip</td>
                                    <td>Rai</td>
                                    <td>600</td>
                                    <td>View</td>
                                    <td><a href="#">Delete</a></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
        
                            </tbody>
                        </table>
                    </div>
        >>>>>>> 799e9d92e2ce1cfe70bfad6ab8c905c65f55a918
                </div>
            </div>-->












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
</body>

</html>