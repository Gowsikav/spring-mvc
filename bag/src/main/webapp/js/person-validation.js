document.querySelector('#form').addEventListener('submit', function(event) {

    document.querySelectorAll(".error").forEach(element => {
        element.textContent = '';
    });

    if(!validate()){
        event.preventDefault();
    }
});

function validate()
{
let isValid = true;
const firstName = document.querySelector('#firstName').value.trim();

if (firstName === '') {
    isValid = false;
    document.querySelector('#firstNameError').textContent = 'First name is required.';
} else {
    document.querySelector('#firstNameError').textContent = '';
}

const lastName = document.querySelector('#lastName').value.trim();

if (lastName === '') {
    isValid = false;
    document.querySelector('#lastNameError').textContent = 'Last name is required.';
} else {
    document.querySelector('#lastNameError').textContent = '';
}

const age = document.querySelector('#age').value.trim();
if (age === '' || isNaN(age) || age < 0) {
    isValid = false;
    document.querySelector('#ageError').textContent = 'Age must be a valid number.';
}
else {
    document.querySelector('#ageError').textContent = '';
}

const email = document.querySelector('#email').value.trim();
const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

if (email === '') {
    isValid = false;
    document.querySelector('#emailError').textContent = 'Email is required.';
} else if (!emailPattern.test(email)) {
    isValid = false;
    document.querySelector('#emailError').textContent = 'Email is not valid.';
} else {
    document.querySelector('#emailError').textContent = '';
}
const gender = document.querySelector('#gender').value.trim();

if (gender === '') {
    isValid = false;
    document.querySelector('#genderError').textContent = 'Gender is required.';
} else {
    document.querySelector('#genderError').textContent = '';
}

const phone = document.querySelector('#phone').value.trim();
const phonePattern = /^\d{10}$/;
if (phone === '') {
    isValid = false;
    document.querySelector('#phoneError').textContent = 'Phone number is required.';
} else if (!phonePattern.test(phone)) {
    isValid = false;
    document.querySelector('#phoneError').textContent = 'Phone number must be 10 digits.';
} else {
    document.querySelector('#phoneError').textContent = '';
}
return isValid;
}