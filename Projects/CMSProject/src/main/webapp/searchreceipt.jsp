
<head>
 <jsp:include page="menubar.html"></jsp:include> 
</head>
  
      <!-- End of Topbar -->

      <!-- Begin Page Content -->
          
      
      <div class="container-fluid">
        <!-- Page Heading -->
        <h1 class="h3 mb-0 text-gray-800">Search Receipts</h1>
        <p class="mb-4">Manage your customer Receipts transaction here</p>
        <hr><br>
         Name : <input type="text" name="text" >
        <input type="button" class=" btn-primary " name="submit"value="Search" color="success" ></input><hr>

<!--<input type="button" class=" btn-primary " name="submit"value="Make Receipt" color="primary" ></input>-->

        <div class="card-body">
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
        </div>


        <input type="button" class=" btn-success " name="submit"value="Search" color="success" ></input><br><hr>
        <h3 class="m-0 font-weight-bold text-primary">Search Customer Payment Receipt</h3>
        <div class="card-body card shadow mb-4">
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
              <thead>
              <tr>
                <th>Receipt No.</th>
                <th>Date</th>
                <th>Name</th>
                <th>Amount</th>
                <th>View</th>
                <th>Delete</th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td>1</td>
                <td>01-08-Aug</td>
                <td>Amit</td>
                <td>500</td>
                <td>View</td>
                <td>Delete</td>
              </tr>
              <tr>
                <td>2</td>
                <td>02-08-Aug</td>
                <td>Ravi</td>
                <td>100</td>
                <td>View</td>
                <td>Delete</td>
              </tr>
              <tr>
                <td>3</td>
                <td>05-08-Aug</td>
                <td>Arjun</td>
                <td>400</td>
                <td>View</td>
                <td>Delete</td>
              </tr>
              <tr>
                <td>4</td>
                <td>08-08-Aug</td>
                <td>Karan</td>
                <td>900</td>
                <td>View</td>
                <td>Delete</td>
              </tr>
              <tr>
                <td>5</td>
                <td>09-08-Aug</td>
                <td>dilip</td>
                <td>600</td>
                <td>View</td>
                <td>Delete</td>
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