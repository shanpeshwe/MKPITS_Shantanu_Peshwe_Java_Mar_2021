<head>
 <jsp:include page="menubar.html"></jsp:include> 
</head>

      <!-- Begin Page Content -->
            <div class="container-fluid">
                <!-- Page Heading -->
                <h1 class="h3 mb-0 text-gray-800">Customer Package Info</h1>
                <p class="mb-4">Manage your customer package information here</p>
                <hr><br>

                <!--        <input type="button" class=" btn-primary " name="submit"value="Make Receipt" color="primary" ></input>-->

                <!--        By Month : <input type="month">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
                <!--        By Period : <input type="number">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
                <!--        By City : <input type="city">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->

                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="button" class=" btn-primary " name="submit"value="Add Package" color="success" ></input>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="search" name="search" value="search" placeholder="search"> <input type="button" class=" btn-primary " name="submit"value="Search" color="success" ></input>
                <!--        <div class="card-body">-->
                <!--          <div class="table-responsive">-->
                <!--            <table class="table table-bordered"  width="100%" cellspacing="0">-->
                <!--              <thead>-->
                <!--              <tr>-->
                <!--                <th>From Date:</th>-->
                <!--                <input type="date" name="date" />-->
                <!--                <th>To Date:</th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
                <!--                <input type="date" name="date" />-->
                <!--              </tr>-->
                <!--              </thead>-->
                <!--            </table>-->
                <!--          </div>-->
                <!--        </div>-->


                <!--        <input type="button" class=" btn-success " name="submit"value="Search" color="success" ></input><br><hr>-->
                <!--        <h6 class="m-0 font-weight-bold text-primary">Active Connections</h6>-->
                <br><br><br><h3 class="m-0 font-weight-bold text-primary">Customer Package List</h3><br>

            </div>
            <div class="card-body card shadow mb-4">
                <div class="card-body">
                    <div class="table-responsive">
                        <table class="table table-bordered text-center" id="dataTable" width="100%" cellspacing="0">
                            <thead>
                            <tr>
                                <th>Package Name</th>
                                <th>Amount</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>

                            <tbody >

                            <tr>
                                <td>Gold</td>
                                <td>200/-</td>
                                <td><a href="#">Edit</a></td>
                                <td><a href="#">Delete</a></td>
                            </tr>

                            <tr>
                                <td>Silver</td>
                                <td>400/-</td>
                                <td><a href="#">Edit</a></td>
                                <td><a href="#">Delete</a></td>
                            </tr>

                            <tr>
                                <td>Platinum </td>
                                <td>300/-</td>
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
<!-- Bootstrap core JavaScript - for search and master expand-->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Custom scripts for all pages - for side bar minimize-->
<script src="js/sb-admin-2.min.js"></script>
</body>

</html>