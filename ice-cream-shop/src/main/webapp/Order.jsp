<%@ page isELIgnored="false" %>
    <html lang="en">

    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Order</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr"
            crossorigin="anonymous" />
    </head>

    <body>
        <nav class="navbar navbar-expand-lg" style="background-color: rgb(43, 239, 135); ">
            <div class="container-fluid">
                <img class="navbar-brand" src="images/ice-cream-icon.png" alt="Logo" height="100px" />
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link" href="index.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="Order.jsp">Order Now!</a>
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
            <form action="order" id="form" class="p-4 border rounded shadow" style="width: 100%; max-width: 600px;">
                <h4 class="text-center mb-4">Ice Cream Order</h4>
                <h6 class="text-center text-danger mb-4">${message}</h6>

                <div class="mb-3">
                    <label for="name" class="form-label">Name</label>
                    <input type="text" class="form-control" id="name" name="name" value="${dto.name}" required>
                    <span id="nameError" class="error small text-danger"></span>

                </div>

                <div class="mb-3">
                    <label for="flavour" class="form-label">Flavour</label>
                    <select class="form-select" id="flavour" name="flavour" required>
                        <option value="">Select Flavour</option>
                        <option value="Chocolate">Chocolate</option>
                        <option value="Pista">Pista</option>
                        <option value="Vanilla">Vanilla</option>
                        <option value="ButterScotch">ButterScotch</option>
                        <option value="StrawBerry">StrawBerry</option>
                        <option value="Mango">Mango</option>
                    </select>
                    <span id="flavourError" class="error small text-danger"></span>
                </div>

                <div class="mb-3">
                    <label for="quantity" class="form-label">Quantity</label>
                    <input type="number" class="form-control" id="quantity" name="quantity" value="${dto.quantity}"
                        required>
                    <span id="quantityError" class="error small text-danger"></span>
                </div>

                <div class="mb-3">
                    <label for="takeAway" class="form-label">Take Away (Extra charge Rs.20/-)</label>
                    <select class="form-select" id="takeAway" name="takeAway" required>
                        <option value="">Select Option</option>
                        <option value="true">Yes</option>
                        <option value="false">No</option>
                    </select>
                    <span id="takeAwayError" class="error small text-danger"></span>
                </div>

                <div class="mb-3">
                    <label for="addOn" class="form-label">Add on (Extra charge for each Rs.15/-)</label>
                    <select class="form-select" id="addOn" name="addOn" required>
                        <option value="">Select Option</option>
                        <option value="true">Yes</option>
                        <option value="false">No</option>
                    </select>
                    <span id="addOnError" class="error small text-danger"></span>
                </div>

                <div class="mb-3">
                    <label for="coupon" class="form-label">Coupon Code</label>
                    <div class="d-flex gap-1">
                        <input type="text" class="form-control" id="coupon" name="couponCode">
                        <button type="button" class="btn btn-primary" onclick="getRandomCoupon()">Get Coupon
                            Code</button>
                    </div>
                </div>

                <div class="text-center">
                    <button type="submit" class="btn btn-success">Order</button>
                </div>
            </form>
        </div>

        <footer class="text-center text-lg-start py-3" style="background-color: rgb(43, 239, 135);">
            <div class="text-center text-dark">
                &copy; 2025 Ice Cream Shop.
            </div>
        </footer>

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
            integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
            crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.min.js"
            integrity="sha384-7qAoOXltbVP82dhxHAUje59V5r2YsVfBafyUDxEdApLPmcdhBPg1DKg1ERo0BZlK"
            crossorigin="anonymous"></script>
        <script src="js/order-validate.js?v=2"></script>
    </body>

    </html>