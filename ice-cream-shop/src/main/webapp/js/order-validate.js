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
  } else if (name.length < 3 || name.length > 25) {
    document.querySelector("#nameError").textContent =
      "Name length should be above 3 and below 25";
    hasError = true;
  }

  const email = document.querySelector("#email").value.trim();
    if (email === "") {
      document.querySelector("#emailError").textContent = "email is required";
      hasError = true;
    } else if (email.length < 10 || email.length > 50) {
      document.querySelector("#emailError").textContent =
        "Email length should be above 10 and below 50";
      hasError = true;
    }else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
       document.querySelector("#emailError").textContent = "Invalid email format";
       hasError = true;
       }

  const flavour = document.querySelector("#flavour").value;
  if (flavour === "") {
    document.querySelector("#flavourError").textContent = "Flavour is required";
    hasError = true;
  }

  const quantity = document.querySelector("#quantity").value;
  if (quantity === "") {
    document.querySelector("#quantityError").textContent =
      "Quantity is required";
    hasError = true;
  } else if (quantity <= 0 || quantity > 15) {
    document.querySelector("#quantityError").textContent =
      "Quantity should be above 0 and below 15";
    hasError = true;
  }

  const takeAway = document.querySelector("#takeAway").value;
  if (takeAway === "") {
    document.querySelector("#takeAwayError").textContent =
      "TakeAway is required";
    hasError = true;
  }

  const addOn = document.querySelector("#addOn").value;
  if (addOn === "") {
    document.querySelector("#addOnError").textContent = "AddOn is required";
    hasError = true;
  }

  return hasError;
}

window.getRandomCoupon = function () {
    const coupons = [
        "NEW50", "FESTIVAL50", "SALE75", "ICE20", "COOL40",
        "BITES20", "SHOP25", "BOX20", "FAMILY20", "MELTS20"
    ];

    const randomIndex = Math.floor(Math.random() * coupons.length);
    const randomCoupon = coupons[randomIndex];

    document.getElementById("coupon").value = randomCoupon;
}

