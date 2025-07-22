<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Fruit Form</title>
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
                        <a class="nav-link" href="PoliceStation.jsp">Police Station Form</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="Fruit.jsp">Fruit Form</a>
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
        <form action="fruit" class="p-4 border rounded shadow" style="width: 100%; max-width: 600px">
            <h4 class="text-center mb-4">Fruit Form</h4>
            <div class="row">
                <div class="col-md-6 mb-3">
                    <label for="fruitName" class="form-label">Fruit Name</label>
                    <input type="text" class="form-control" id="fruitName" name="fruitName" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="color" class="form-label">Color</label>
                    <input type="text" class="form-control" id="color" name="color" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="taste" class="form-label">Taste</label>
                    <input type="text" class="form-control" id="taste" name="taste" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="season" class="form-label">Season</label>
                    <input type="text" class="form-control" id="season" name="season" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="originCountry" class="form-label">Country of Origin</label>
                    <input type="text" class="form-control" id="originCountry" name="originCountry" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="averageWeight" class="form-label">Average Weight (grams)</label>
                    <input type="number" class="form-control" id="averageWeight" name="averageWeight" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="vitamins" class="form-label">Vitamins Present</label>
                    <select class="form-select" id="vitamins" name="vitamins">
                        <option value="">Select Vitamins</option>
                        <option value="Vitamin A">Vitamin A</option>
                        <option value="Vitamin B">Vitamin B</option>
                        <option value="Vitamin C">Vitamin C</option>
                        <option value="Vitamin D">Vitamin D</option>
                        <option value="Vitamin E">Vitamin E</option>
                        <option value="Vitamin K">Vitamin K</option>
                    </select>
                </div>
                <div class="col-md-6 mb-3">
                    <label for="isTropical" class="form-label">Is Tropical?</label>
                    <select class="form-select" id="isTropical" name="isTropical">
                        <option value="">Select</option>
                        <option value="true">Yes</option>
                        <option value="false">No</option>
                    </select>
                </div>
                <div class="col-md-6 mb-3">
                    <label for="pricePerKg" class="form-label">Price per Kg</label>
                    <input type="number" class="form-control" id="pricePerKg" name="pricePerKg" />
                </div>
                <div class="col-md-6 mb-3">
                    <label for="exported" class="form-label">Exported?</label>
                    <select class="form-select" id="exported" name="exported">
                        <option value="">Select</option>
                        <option value="true">Yes</option>
                        <option value="false">No</option>
                    </select>
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