<%@ page isELIgnored="false" %>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Contact</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous" />
</head>

<body>
    <nav class="navbar navbar-expand-lg" style="background-color: rgb(107, 176, 234);">
        <div class="container-fluid">
            <img class="navbar-brand" src="images/contact-icon.png" alt="Logo" height="100px"/>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link " href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="Contact.jsp">Contact</a>
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
            <form action="contact" id="form" class="p-4 border rounded shadow" style="width: 100%; max-width: 600px;">
                <h4 class="text-center mb-4">Contact</h4>
                <h6 class="text-center text-danger mb-4">${message}</h6>

                <div class="mb-3">
                    <label for="name" class="form-label">Name</label>
                    <input type="text" class="form-control" id="name" name="name" value="${contactDTO.name}" required>
                    <span id="nameError" class="error small text-danger"></span>
                </div>

                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" name="email" value="${contactDTO.email}"
                        required>
                    <span id="EmailError" class="error small text-danger"></span>
                </div>

                <div class="mb-3">
                    <label for="phoneNumber" class="form-label">Phone number</label>
                    <input type="tel" class="form-control" id="phoneNumber" name="phoneNumber" value="${contactDTO.phoneNumber}"
                           required>
                    <span id="phoneNumberError" class="error small text-danger"></span>
                </div>
                <div class="mb-3">
                    <label for="comments" class="form-label">Comments</label>
                    <textarea class="form-control" id="comments" name="comments" rows="3" required>${contactDTO.comments}</textarea>
                    <span id="commentsError" class="error small text-danger"></span>
                </div>

                <div class="text-center">
                    <button type="submit" class="btn btn-success">Submit</button>
                </div>
            </form>
        </div>

    <footer class="text-center text-lg-start py-3" style="background-color: rgb(107, 176, 234);">
        <div class="text-center text-dark">
            &copy; 2025 Contact details.
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