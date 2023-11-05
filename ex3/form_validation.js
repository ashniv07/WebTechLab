function validateForm() {
    var bookTitle = document.getElementById("bookTitle").value;
    var bookTitleError = document.getElementById("bookTitleError");

    if (bookTitle === "") {
        bookTitleError.textContent = "Book Title is required.";
        return false;
    } else {
        bookTitleError.textContent = "";
        return true;
    }
}
