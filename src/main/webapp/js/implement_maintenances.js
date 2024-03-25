document.addEventListener("DOMContentLoaded", function() {
    var input = document.getElementsByClassName("main-content-search")[0];

    input.addEventListener('input', function() {
        var filter = input.value.toUpperCase();
        var items = document.getElementsByClassName("table-td-row");
        var fieldNames = [];
        for(let i = 0; i < items.length; i++) {
            fieldNames.push(items[i].getElementsByClassName("type-cell")[0]);
        }

        for(let i = 0; i < fieldNames.length; i++) {
            var title = fieldNames[i].getElementsByTagName("a")[0];
            if(title) {
                var titleValue = title.textContent;
                items[i].style.display = titleValue.toUpperCase().indexOf(filter) > -1 ? "" : "none";
            }
        }
    });
});