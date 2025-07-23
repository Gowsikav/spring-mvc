document.querySelector('#form').addEventListener('submit', function (event) {

    document.querySelectorAll('.error').forEach(function (el) {
        el.textContent = '';
    });

    if (!validateForm()) {
        event.preventDefault();
    }

});

function validateForm() {
    let isValid = true;

    const degree = document.querySelector('#degree');
    if (!degree.value) {
        document.querySelector('#degreeError').textContent = 'Degree is required.';
        isValid = false;
    }

    const collegeName = document.querySelector('#collegeName');
    if (!collegeName.value) {
        document.querySelector('#collegeNameError').textContent = 'College Name is required.';
        isValid = false;
    }
    const branch = document.querySelector('#branch');
    if (!branch.value) {
        document.querySelector('#branchError').textContent = 'Branch is required.';
        isValid = false;
    }
    
    const yearOfPassing = document.querySelector('#yearOfPassing');
    if (!yearOfPassing.value || yearOfPassing.value < 1900 || yearOfPassing.value > 2100) {
        document.querySelector('#yearOfPassingError').textContent = 'Year of Passing must be between 1900 and 2100.';
        isValid = false;
    }

    const percentage = document.querySelector('#percentage');
    if (!percentage.value || percentage.value < 10 || percentage.value > 100) {
        document.querySelector('#percentageError').textContent = 'Percentage must be between 10 and 100.';
        isValid = false;
    }

    return isValid;
}