document.querySelector("#form").addEventListener("submit", function (event) {
  document.querySelector("#excelFileError").textContent = "";
  const hasErrors = validate();
  if (hasErrors) {
    event.preventDefault();
  }
});

function validate() {
  let hasError = false;

  const file = document.querySelector("#excelFile").files[0];
  if (!file) {
    document.querySelector("#excelFileError").textContent =
      "Excel file is required";
    hasError = true;
  } else {
    const fileName = file.name.toLowerCase();
    const allowedExtensions = ["xlsx", "xls", "csv"];
    const fileExtension = fileName.split(".").pop();

    if (!allowedExtensions.includes(fileExtension)) {
      document.querySelector("#excelFileError").textContent =
        "Only .xlsx, .xls, and .csv files are allowed";
      hasError = true;
    }
  }
  return hasError;
}
