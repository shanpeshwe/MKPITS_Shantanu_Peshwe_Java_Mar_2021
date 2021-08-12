

--><head><!--
<jsp:include page="menubar.html"></jsp:include>
--></head><!--

 
      <!-- End of Topbar -->

      <!-- Begin Page Content -->
      <div class="container-fluid">
        <!-- Page Heading -->
        <h1 class="h3 mb-0 text-gray-800">Customer Info</h1>
        <p class="mb-4">Manage your customer accounts here</p>
        <hr><br>

        <!--        <input type="button" class=" btn-primary " name="submit"value="Make Receipt" color="primary" ></input>-->

<!--        By Month : <input type="month">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
        <!--        By Period : <input type="number">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
        <!--        By City : <input type="city">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->

        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="button" class=" btn-primary " name="submit"value="Add Customer" color="success" ></input>
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
        <br><br><br><h3 class="m-0 font-weight-bold text-primary">Customer List</h3><br>

      </div>
      <div class="card-body card shadow mb-4">
      <div class="card-body">
        <div class="table-responsive">
          <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
            <thead>
            <tr>
              <th>User Id</th>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Phone Number</th>
              <th>Amount</th>
              <th>Address</th>
              <th>Email</th>
              <th>Package</th>
              <th>Area</th>
              <th>Set-top box no.</th>
              <th>Status</th>
            </tr>



            <tbody>
            <tr>
              <td>1</td>
              <td>Karan</td>
              <td>tandon</td>
              <td>954632145</td>
              <td>1000</td>
              <td>mumbai</td>
              <td>Karan@gmail.com</td>
              <td>500</td>
              <td>lalbag</td>
              <td>556</td>
              <td>Active</td>



            </tr>
            <tr>
              <td>2</td>
              <td>ramesh</td>
              <td>kanin</td>
              <td>965432145</td>
              <td>2000</td>
              <td>nagpur</td>
              <td>ramesh@gmail.com</td>
              <td>600</td>
              <td>gandibag</td>
              <td>558</td>
              <td>Active</td>


            <tr>
              <td>3</td>
              <td>jayesh</td>
              <td>kumar</td>
              <td>652415</td>
              <td>3000</td>
              <td>pune</td>
              <td>Jayesh@gmail.com</td>
              <td>800</td>
              <td>sitapur</td>
              <td>554</td>
              <td>Active</td>


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