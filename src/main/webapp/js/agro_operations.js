document.addEventListener("DOMContentLoaded", function() {
    var input = document.getElementsByClassName("main-content-search")[0];

    input.addEventListener('input', function() {
        var filter = input.value.toUpperCase();
        var items = document.getElementsByClassName("table-td-row");
        var workTypeInfoBlocks = [];
        for(let i = 0; i < items.length; i++) {
            workTypeInfoBlocks.push(items[i].getElementsByClassName("work-type-cell")[0].getElementsByClassName("work-type-info")[0]);
        }

        for(let i = 0; i < workTypeInfoBlocks.length; i++) {
            var title = workTypeInfoBlocks[i].getElementsByTagName("a")[0];
            if(title) {
                var titleValue = title.textContent;
                items[i].style.display = titleValue.toUpperCase().indexOf(filter) > -1 ? "" : "none";
            }
        }
    });
});