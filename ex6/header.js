function updateDateTime() {
    const currentDate = new Date();
    const dateElement = document.getElementById("current-date");
    const timeElement = document.getElementById("current-time");

    dateElement.textContent = currentDate.toLocaleDateString();
    timeElement.textContent = currentDate.toLocaleTimeString();
}

setInterval(updateDateTime, 1000); // Update the time every second
