document.querySelector("#form").addEventListener("submit", function (event) {
  document.querySelectorAll(".error").forEach((e) => (e.textContent = ""));

  const hasErrors = validate();
  if (hasErrors) {
    event.preventDefault();
  }
});

function validate() {
  let hasError = false;

  const fullname = document.querySelector("#fullname").value.trim();
  if (fullname === "") {
    document.querySelector("#fullnameError").textContent =
      "Full Name is required";
    hasError = true;
  } else if (fullname.length < 3 || fullname.length > 50) {
    document.querySelector("#fullnameError").textContent =
      "Full Name length should be between 3 and 50 characters";
    hasError = true;
  }

  const email = document.querySelector("#email").value.trim();
  const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (email === "") {
    document.querySelector("#emailError").textContent = "Email is required";
    hasError = true;
  } else if (!emailPattern.test(email)) {
    document.querySelector("#emailError").textContent = "Invalid email format";
    hasError = true;
  }

  const phonenumber = document.querySelector("#phonenumber").value.trim();
  const phonePattern = /^[0-9]{10}$/;
  if (phonenumber === "") {
    document.querySelector("#phonenumberError").textContent =
      "Phone Number is required";
    hasError = true;
  } else if (!phonePattern.test(phonenumber)) {
    document.querySelector("#phonenumberError").textContent =
      "Phone Number should be 10-15 digits";
    hasError = true;
  }

  const resumeFile = document.querySelector("#resume").files[0];
  if (!resumeFile) {
    document.querySelector("#resumeError").textContent =
      "Resume file is required";
    hasError = true;
  } else {
    const allowedTypes = [
      "application/pdf",
      "application/msword",
      "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
    ];
    if (!allowedTypes.includes(resumeFile.type)) {
      document.querySelector("#resumeError").textContent =
        "Only PDF or Word documents are allowed";
      hasError = true;
    }
  }
  return hasError;
}
