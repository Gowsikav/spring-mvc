<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Name Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous" />
</head>

<body>
    <nav class="navbar navbar-expand-lg" style="background-color: rgb(243, 106, 217);">
        <div class="container-fluid">
            <img class="navbar-brand" src="images/form-icon.png" alt="Form icon">
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
                        <a class="nav-link active" href="Name.jsp">Name Form</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Hospital.jsp">Hospital Form</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="RTO.jsp">RTO Form</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="PoliceStation.jsp">Police Station Form</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Fruit.jsp">Fruit Form</a>
                    </li>

                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success text-dark bg-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>

    <div class="container d-flex justify-content-center my-5">
        <form action="name" class="p-4 border rounded shadow" style="width: 100%; max-width: 600px;">
            <h4 class="text-center mb-4">Name Form</h4>

            <div class="mb-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName">
            </div>

            <div class="mb-3">
                <label for="middleName" class="form-label">Middle Name</label>
                <input type="text" class="form-control" id="middleName" name="middleName">
            </div>

            <div class="mb-3">
                <label for="lastName" class="form-label">Last Name</label>
                <input type="text" class="form-control" id="lastName" name="lastName">
            </div>

            <div class="mb-3">
                <label for="displayName" class="form-label">Display Name</label>
                <input type="text" class="form-control" id="displayName" name="displayName">
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
    </div>


    <footer class="text-center text-lg-start py-5" style="background-color: rgb(243, 106, 217)">
        <div class="text-center text-dark">
            &copy; 2025 Form Central. All rights reserved.
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
        integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
        integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
        crossorigin="anonymous"></script>
</body>

</html>