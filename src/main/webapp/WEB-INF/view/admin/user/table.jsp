<%@page contentType="text/html" pageEncoding="UTF-8" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %> <%@taglib
uri="http://www.springframework.org/tags/form" prefix="form"%>

<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Create Users</title>
    <!-- Latest compiled and minified CSS -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />

    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <!-- <link href="/css/demo.css" rel="stylesheet"> -->
  </head>

  <body>
    <div class="container mt-5">
      <div class="d-flex justify-content-between">
        <h1>Table User</h1>
        <div>
          <a href="/admin/user/create"
            ><button class="btn btn-primary">Create a User</button></a
          >
        </div>
      </div>
      <hr />
      <table class="table table-bordered table-hover">
        <thead>
          <tr>
            <th>id</th>
            <th>Email</th>
            <th>Full Name</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td>Mark</td>
            <td>Otto</td>
            <td>
              <a href=""><button class="btn btn-success">View</button></a>
              <a href=""><button class="btn btn-warning">Update</button></a>
              <a href=""><button class="btn btn-danger">View</button></a>
            </td>
          </tr>
          <tr>
            <td>2</td>
            <td>Mark</td>
            <td>Otto</td>
            <td>
              <a href=""><button class="btn btn-success">View</button></a>
              <a href=""><button class="btn btn-warning">Update</button></a>
              <a href=""><button class="btn btn-danger">View</button></a>
            </td>
          </tr>
          <tr>
            <td>3</td>
            <td>Mark</td>
            <td>Otto</td>
            <td>
              <a href=""><button class="btn btn-success">View</button></a>
              <a href=""><button class="btn btn-warning">Update</button></a>
              <a href=""><button class="btn btn-danger">View</button></a>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </body>
</html>
