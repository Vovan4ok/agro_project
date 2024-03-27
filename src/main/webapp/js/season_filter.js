document.addEventListener("DOMContentLoaded", function() {
    const select = document.getElementById("season-select");

    select.addEventListener("change", function() {
        const selectedOption = select.value;
        if(selectedOption) {
            window.location.replace("?season=" + selectedOption);
        }
    });
});

