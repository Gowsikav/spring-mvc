<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Police Station Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous" />
</head>

<body>
    <nav class="navbar navbar-expand-lg" style="background-color: rgb(243, 106, 217)">
        <div class="container-fluid">
            <img class="navbar-brand" src="images/form-icon.png" alt="Form icon" />
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
                        <a class="nav-link" href="Name.jsp">Name Form</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Hospital.jsp">Hospital Form</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="RTO.jsp">RTO Form</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="PoliceStation.jsp">Police Station Form</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Fruit.jsp">Fruit Form</a>
                    </li>
                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
                    <button class="btn btn-outline-success text-dark bg-success" type="submit">
                        Search
                    </button>
                </form>
            </div>
        </div>
    </nav>

    <div class="container d-flex justify-content-center my-5">
        <form action="policeStation" class="p-4 border rounded shadow" style="width: 100%; max-width: 600px">
            <h4 class="text-center mb-4">Police Station Form</h4>
            <div class="row">
                <div class="col-md-6 mb-3">
                    <label for="stationName" class="form-label">Police Station Name</label>
                    <input type="text" class="form-control" id="stationName" name="stationName" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="address" class="form-label">Address</label>
                    <input type="text" class="form-control" id="address" name="address" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="city" class="form-label">City</label>
                    <input type="text" class="form-control" id="city" name="city" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="district" class="form-label">District</label>
                    <input type="text" class="form-control" id="district" name="district" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="state" class="form-label">State</label>
                    <input type="text" class="form-control" id="state" name="state" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="pincode" class="form-label">Pincode</label>
                    <input type="text" class="form-control" id="pincode" name="pincode" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="contactNumber" class="form-label">Contact Number</label>
                    <input type="tel" class="form-control" id="contactNumber" name="contactNumber" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" name="email" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="stationType" class="form-label">Station Type</label>
                    <select class="form-select" id="stationType" name="stationType">
                        <option value="">Select Type</option>
                        <option value="Urban">Urban</option>
                        <option value="Rural">Rural</option>
                        <option value="Traffic">Traffic</option>
                        <option value="Women">Women</option>
                        <option value="Cyber">Cyber</option>
                    </select>
                </div>
                <div class="col-md-6 mb-3">
                    <label for="inChargeName" class="form-label">Station In-Charge Name</label>
                    <input type="text" class="form-control" id="inChargeName" name="inChargeName" />
                </div>
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