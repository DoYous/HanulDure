function toggleButton(activeId, inactiveId) {
    var activeButton = document.getElementById(activeId);
    var inactiveButton = document.getElementById(inactiveId);

    if (activeButton.classList.contains('buttonActive')) {
        activeButton.classList.remove('buttonActive');
        activeButton.classList.add('buttonNormal');
    } else {
        activeButton.classList.remove('buttonNormal');
        activeButton.classList.add('buttonActive');
        inactiveButton.classList.remove('buttonActive');
        inactiveButton.classList.add('buttonNormal');
    }
}