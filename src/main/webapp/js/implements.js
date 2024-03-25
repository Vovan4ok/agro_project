document.addEventListener("DOMContentLoaded", function() {
    var input = document.getElementsByClassName("main-content-search")[0];

    input.addEventListener('input', function() {
        var filter = input.value.toUpperCase();
        var items = document.getElementsByClassName("table-td-row");
        var machineNames = [];
        for(let i = 0; i < items.length; i++) {
            machineNames.push(items[i].getElementsByClassName("table-td")[0]);
        }

        for(let i = 0; i < machineNames.length; i++) {
            var title = machineNames[i].getElementsByTagName("a")[0];
            if(title) {
                var titleValue = title.textContent;
                items[i].style.display = titleValue.toUpperCase().indexOf(filter) > -1 ? "" : "none";
            }
        }
    });
});