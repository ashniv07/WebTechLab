function validateForm() {
    var username = document.getElementById("username").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;
    var captcha = document.getElementById("captcha").value;

    if (username.trim() === "") {
        alert("Username cannot be blank.");
        return false;
    }

    if (!email.includes("@")) {
        alert("Invalid email address.");
        return false;
    }

    if (password.length < 5) {
        alert("Password must be at least 5 characters long.");
        return false;
    }

    if (captcha !== "5") {
        alert("Captcha is incorrect.");
        return false;
    }

    return true;
}
