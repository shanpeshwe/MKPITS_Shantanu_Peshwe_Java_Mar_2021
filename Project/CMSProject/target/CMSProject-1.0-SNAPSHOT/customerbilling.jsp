<head>
       <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
    <title>CMS - Customer Billing</title>
 <jsp:include page="menubar.jsp"></jsp:include> 
</head>

      <!-- Begin Page Content -->
      <div class="container-fluid">
        <!-- Page Heading -->
        <h1 class="h3 mb-0 text-gray-800">Customer Billing</h1>
        <p class="mb-4">Manage your customer monthly billing here</p>
        <hr><br>

<!--        <input type="button" class=" btn-primary " name="submit"value="Make Receipt" color="primary" ></input>-->
 <label for="bdaymonth">By Month :</label>
  <input type="month" id="bdaymonth" name="bdaymonth">
  <input type="button" class=" btn-success " name="submit"value="Generate Bill" color="success" ></input>
<!--  <input type="submit">-->


<!--        By Month : <input type="month">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
<!--        By Period : <input type="number">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
<!--        By City : <input type="city">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->

        
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

       <br> <br><br><br><h3 class="m-0 font-weight-bold text-primary">Customer Billing List</h3>

      </div>
      <div class="card-body card shadow mb-4">
      <div class="card-body">
        <div class="table-responsive">
          <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
            <thead>
            <tr>
<!--              <th>ID</th>-->
              <th>Bill Month</th>
              <th>Date</th>
<!--              <th>Period</th>-->
              <th>Amount</th>
<!--              <th>Active con.</th>-->
<!--              <th>Inactive con.</th>-->
<!--              <th>View</th>-->
              <th>Delete</th>
            </tr>
            



      <tbody>
      <tr>
        <td>Januray</td>
        <td>01-08-21</td>
        <td>1000</td>
        <td><a href="#">
          <span class="glyphicon glyphicon-trash"></span>
        </a></td>


      </tr>
      <tr>
        <td>Febraury</td>
        <td>02-08-21</td>
        <td>2000</td>
        <td><a href="#">
          <span class="glyphicon glyphicon-trash"></span>
        </a></td>

      <tr>
        <td>March</td>
        <td>03-08-21</td>
        <td>3000</td>
        <td><a href="#">
          <span class="glyphicon glyphicon-trash"></span>
        </a></td>

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
</body>

</html>