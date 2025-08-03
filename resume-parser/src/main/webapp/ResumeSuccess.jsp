<%@ page isELIgnored="false" %>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Resume Submitted</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr"
      crossorigin="anonymous"
    />
  </head>

  <body>
    <nav
      class="navbar navbar-expand-lg"
      style="background-color: rgb(43, 239, 135)"
    >
      <div class="container-fluid">
        <img
          class="navbar-brand"
          src="images/resume-icon.png"
          alt="Logo"
          height="100px"
        />
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link" href="index.jsp">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" href="Resume.jsp">Send Resume</a>
            </li>
          </ul>
          <form class="d-flex" role="search">
            <input
              class="form-control me-2"
              type="search"
              placeholder="Search"
              aria-label="Search"
            />
            <button class="btn btn-outline-success text-dark" type="submit">
              Search
            </button>
          </form>
        </div>
      </div>
    </nav>

    <p class="h4 text-success text-center my-4">
      Resume successfully submitted for ${fullName}!
    </p>
    <img
      src="images/resume-success.png"
      alt="Success"
      class="d-block mx-auto mb-4"
      style="width: 300px; height: 300px"
    />

    <footer
      class="text-center text-lg-start py-3 fixed-bottom"
      style="background-color: rgb(43, 239, 135)"
    >
      <div class="text-center text-dark">&copy; 2025 Resume Parser.</div>
    </footer>

    <script
      src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
      integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.min.js"
      integrity="sha384-7qAoOXltbVP82dhxHAUje59V5r2YsVfBafyUDxEdApLPmcdhBPg1DKg1ERo0BZlK"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
