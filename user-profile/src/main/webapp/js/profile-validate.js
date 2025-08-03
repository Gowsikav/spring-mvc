document.querySelector("#form").addEventListener("submit", function (event) {
  document.querySelectorAll(".error").forEach((e) => (e.textContent = ""));

  const hasErrors = validate();
  if (hasErrors) {
    event.preventDefault();
  }
});

function validate() {
  let hasError = false;

  const name = document.querySelector("#name").value.trim();
  if (name === "") {
    document.querySelector("#nameError").textContent = "Name is required";
    hasError = true;
  } else if (name.length < 3 || name.length > 50) {
    document.querySelector("#nameError").textContent =
      "Name length should be between 3 and 50 characters";
    hasError = true;
  }

  const email = document.querySelector("#email").value.trim();
  if (email === "") {
    document.querySelector("#emailError").textContent = "Email is required";
    hasError = true;
  } else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
    document.querySelector("#emailError").textContent = "Invalid email format";
    hasError = true;
  }

  const dob = document.querySelector("#dob").value.trim();
  if (dob === "") {
    document.querySelector("#dobError").textContent =
      "Date of Birth is required";
    hasError = true;
  }

  const file = document.querySelector("#image").files[0];
  if (!file) {
    document.querySelector("#imageError").textContent =
      "Profile image is required";
    hasError = true;
  } else {
    const allowedTypes = ["image/jpeg", "image/png", "image/gif"];
    if (!allowedTypes.includes(file.type)) {
      document.querySelector("#imageError").textContent =
        "Only JPG, PNG, or GIF images are allowed";
      hasError = true;
    }
  }
  return hasError;
}
