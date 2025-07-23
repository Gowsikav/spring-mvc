<%@ page isELIgnored="false" %>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Person Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous" />
</head>

<body>
    <nav class="navbar navbar-expand-lg" style="background-color: rgb(197, 98, 227);">
        <div class="container-fluid">
            <img class="navbar-brand" src="images/form-icon.png" alt="Logo" />
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="PersonDetails.jsp">Person Details</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="ProductDetails.jsp">Product Details</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="EducationDetails.jsp">Education Details</a>
                    </li>

                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
                    <button class="btn btn-outline-success text-dark" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
    <p class="h4 text-success text-center my-4">Person Information</p>

<div class="container d-flex justify-content-center">
  <div class="w-100" style="max-width: 600px;">
    <table class="table table-bordered table-striped text-center">
      <tbody>
        <tr>
          <th scope="row">First Name</th>
          <td>${personDTO.firstName}</td>
        </tr>
        <tr>
          <th scope="row">Last Name</th>
          <td>${personDTO.lastName}</td>
        </tr>
        <tr>
          <th scope="row">Age</th>
          <td>${personDTO.age}</td>
        </tr>
        <tr>
          <th scope="row">Email</th>
          <td>${personDTO.email}</td>
        </tr>
        <tr>
          <th scope="row">Gender</th>
          <td>${personDTO.gender}</td>
        </tr>
        <tr>
          <th scope="row">Contact Number</th>
          <td>${personDTO.contact}</td>
        </tr>
        
      </tbody>
    </table>
  </div>
</div>

    <footer class="text-center text-lg-start py-5 fixed-bottom" style="background-color: rgb(197, 98, 227);">
        <div class="text-center text-dark">
            &copy; 2025 Form Details.
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.min.js"
        integrity="sha384-7qAoOXltbVP82dhxHAUje59V5r2YsVfBafyUDxEdApLPmcdhBPg1DKg1ERo0BZlK"
        crossorigin="anonymous"></script>
</body>

</html>