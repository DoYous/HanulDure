window.addEventListener('DOMContentLoaded', (event) => {

    event.preventDefault();

    const boardType = document.getElementById('boardType').value;
    const freeButton = document.getElementById('freeButton');
    const recruitButton = document.getElementById('recruitButton');

    if (boardType === 'F') {
        freeButton.classList.remove('buttonNormal');
        freeButton.classList.add('buttonSelected');
    } else if (boardType === 'R') {
        recruitButton.classList.remove('buttonNormal');
        recruitButton.classList.add('buttonSelected');
    }
});

// function modifyComment(button) {
//     var boardSeq = button.getAttribute('data-boardseq');
//     location.href = '/hanuldure/community/' + boardSeq;
// }