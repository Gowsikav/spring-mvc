<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Product Details</title>
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
                        <a class="nav-link " href="PersonDetails.jsp">Person Details</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="ProductDetails.jsp">Product Details</a>
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
    <div class="container d-flex justify-content-center my-5">
        <form action="product" id="form" class="p-4 border rounded shadow" style="width: 100%; max-width: 600px;">
            <h4 class="text-center mb-4">Product Details Form</h4>

            <div class="mb-3">
                <label for="productName" class="form-label">Product Name</label>
                <input type="text" class="form-control" id="productName" name="productName">
                <span id="productNameError" class="error small text-danger"></span>

            </div>

            <div class="mb-3">
                <label for="price" class="form-label">Price</label>
                <input type="number" class="form-control" min="10" max="1000000" id="price" name="price">
                <span id="priceError" class="error small text-danger"></span>
            </div>

            <div class="mb-3">
                <label for="category" class="form-label">Category</label>
                <select name="category" id="category" class="form-select">
                    <option value="">Select Category</option>
                    <option value="Electronics">Electronics</option>
                    <option value="Clothing">Clothing</option>
                    <option value="Home">Home</option>
                </select>
                <span id="categoryError" class="error small text-danger"></span>
            </div>

            <div class="mb-3">
                <label for="quantity" class="form-label">Quantity</label>
                <input type="number" class="form-control" min="1" max="10" id="quantity" name="quantity">
                <span id="quantityError" class="error small text-danger"></span>
            </div>


            <div class="mb-3">
                <label for="availability" class="form-label">Availability</label>
                <select name="availability" id="availability" class="form-select">
                    <option value="">Select Availability</option>
                    <option value="In-Stock">In Stock</option>
                    <option value="Out-of-Stock">Out of Stock</option>
                </select>
                <span id="availabilityError" class="error small text-danger"></span>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
    </div>

    <footer class="text-center text-lg-start py-5" style="background-color: rgb(197, 98, 227);">
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

    <script src="js/product-validation.js"></script>
</body>

</html>