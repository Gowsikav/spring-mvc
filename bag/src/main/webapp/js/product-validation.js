document.querySelector("#form").addEventListener("submit", function (event) {

    document.querySelectorAll(".error").forEach(function (element) {
        element.textContent = "";
    });

    if (!validate()) {
        event.preventDefault();
    }
});

function validate() {
    let isValid = true;

    const productName = document.querySelector("#productName").value.trim();
    if (productName === "") {
        document.querySelector("#productNameError").textContent = "Product Name is required.";
        isValid = false;
    }

    const price = document.querySelector("#price").value.trim();
    if (price === "") {
        document.querySelector("#priceError").textContent = "Price is required.";
        isValid = false;
    }

    const category = document.querySelector("#category").value;
    if (category === "") {
        document.querySelector("#categoryError").textContent = "Category is required.";
        isValid = false;
    }

    const quantity = document.querySelector("#quantity").value.trim();
    if (quantity === "") {
        document.querySelector("#quantityError").textContent = "Quantity is required.";
        isValid = false;
    }

    const availability = document.querySelector("#availability").value;
    if (availability === "") {
        document.querySelector("#availabilityError").textContent = "Availability is required.";
        isValid = false;
    }
    return isValid;

};
