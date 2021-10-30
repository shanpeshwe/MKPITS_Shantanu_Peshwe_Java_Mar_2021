<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>CMS - Customer</title>
    <jsp:include page="menubar.jsp"></jsp:include> 
</head>

<!-- Begin Page Content -->
<div class="container-fluid">
    <!-- Page Heading -->
    <h1 class="h3 mb-0 text-gray-800">Search Customer</h1>
    <p class="mb-4">Manage your customer accounts here</p>
    <hr>
    <div class="card-body card shadow mb-4">
        <form class="user">
            <!-- Row 1 -->
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">By Name :</label>
                <div class="col-sm-3">
                    <input class="form-control" name="name" id="nameInput" onkeyup="searchByName()" placeholder="Search by Name..">
                </div>
                <label class="col-sm-2 col-form-label">By Setup-Box No :</label>
                <div class="col-sm-3">
                    <input class="form-control" name="setupboxno" id="setupboxInput" onkeyup="searchBySetupbox()" placeholder="Search by Setup-Box No..">
                </div>
            </div>
        </form>
    </div>
    <hr>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Customer List</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Setup-Box No</th>
                            <th>Area</th>
                            <th>Package</th>
                            <th>Balance</th>
                            <th>Status</th>
                            <th>Edit | Delete</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach var="customer" items="${customers}">
                        <tr>
                            <td>${customer.customerId }</td>
                            <td>${customer.firstName } ${customer.lastName }</td>
                            <td>${customer.setupBoxNo }</td>
                            <td>${customer.area }</td>
                            <td>${customer.packageAmount }</td>
                            <td>${customer.balance }</td>
                            <td>${customer.status }</td>
                            <td><a href="<c:url value="/editcustomer/${customer.customerId}"/>"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
                                <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
                                <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
                                </svg></a> | <a href="/editcustomer"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-archive-fill" viewBox="0 0 16 16">
                                <path d="M12.643 15C13.979 15 15 13.845 15 12.5V5H1v7.5C1 13.845 2.021 15 3.357 15h9.286zM5.5 7h5a.5.5 0 0 1 0 1h-5a.5.5 0 0 1 0-1zM.8 1a.8.8 0 0 0-.8.8V3a.8.8 0 0 0 .8.8h14.4A.8.8 0 0 0 16 3V1.8a.8.8 0 0 0-.8-.8H.8z"/>
                                </svg></a>
                            </td>
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>

                <script>
                function searchByName() {
                    var input, filter, table, tr, td, i, txtValue;
                    input = document.getElementById("nameInput");
                    filter = input.value.toUpperCase();
                    table = document.getElementById("dataTable");
                    tr = table.getElementsByTagName("tr");
                    for (i = 0; i < tr.length; i++) {
                        td = tr[i].getElementsByTagName("td")[1];
                        if (td) {
                                txtValue = td.textContent || td.innerText;
                            if (txtValue.toUpperCase().indexOf(filter) > -1) {
                                tr[i].style.display = "";
                            } else {
                                tr[i].style.display = "none";
                            }
                        }
                    }
                }

                function searchBySetupbox() {
                    var input, filter, table, tr, td, i, txtValue;
                    input = document.getElementById("setupboxInput");
                    filter = input.value.toUpperCase();
                    table = document.getElementById("dataTable");
                    tr = table.getElementsByTagName("tr");
                    for (i = 0; i < tr.length; i++) {
                        td = tr[i].getElementsByTagName("td")[2];
                        if (td) {
                            txtValue = td.textContent || td.innerText;
                            if (txtValue.toUpperCase().indexOf(filter) > -1) {
                                tr[i].style.display = "";
                            } else {
                                tr[i].style.display = "none";
                            }
                        }
                    }
                }
                </script>
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


<!-- Bootstrap core JavaScript - for search and master expand-->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Custom scripts for all pages - for side bar minimize-->
<script src="js/sb-admin-2.min.js"></script>

</body>

</html>