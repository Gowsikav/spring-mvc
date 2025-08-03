document.querySelector("#form").addEventListener("submit", function (event) {
  document.querySelectorAll(".error").forEach((e) => (e.textContent = ""));

  const hasErrors = validate();
  if (hasErrors) {
    event.preventDefault();
  }
});

function validate() {
  let hasError = false;

  const productName = document.querySelector("#productName").value.trim();
  if (productName === "") {
    document.querySelector("#productNameError").textContent =
      "Product Name is required";
    hasError = true;
  } else if (productName.length < 3 || productName.length > 50) {
    document.querySelector("#productNameError").textContent =
      "Product Name length should be between 3 and 50 characters";
    hasError = true;
  }

  const price = document.querySelector("#price").value.trim();
  if (price === "") {
    document.querySelector("#priceError").textContent = "Price is required";
    hasError = true;
  } else if (isNaN(price) || Number(price) <= 0) {
    document.querySelector("#priceError").textContent =
      "Price must be a positive number";
    hasError = true;
  }

  const description = document.querySelector("#description").value.trim();
  if (description === "") {
    document.querySelector("#descriptionError").textContent =
      "Description is required";
    hasError = true;
  } else if (description.length < 10 || description.length > 200) {
    document.querySelector("#descriptionError").textContent =
      "Description length should be between 10 and 200 characters";
    hasError = true;
  }

  const file = document.querySelector("#file").files[0];
  if (!file) {
    document.querySelector("#fileError").textContent =
      "Product image is required";
    hasError = true;
  } else {
    const allowedTypes = ["image/jpeg", "image/png", "image/gif"];
    if (!allowedTypes.includes(file.type)) {
      document.querySelector("#fileError").textContent =
        "Only JPG, PNG, or GIF images are allowed";
      hasError = true;
    }
  }
  return hasError;
}
