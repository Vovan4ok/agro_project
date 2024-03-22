document.addEventListener("DOMContentLoaded", function() {
    var input = document.getElementsByClassName("main-content-search")[0];

    input.addEventListener('input', function() {
        var filter = input.value.toUpperCase();
        var items = document.getElementsByClassName("block-info");

        for(let i = 0; i < items.length; i++) {
            var title = items[i].getElementsByTagName("h2")[0];
            if(title) {
                var titleValue = title.textContent;
                items[i].style.display = titleValue.toUpperCase().indexOf(filter) > -1 ? "" : "none";
            }
        }
    });
});