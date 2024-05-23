function toggleButton(activeId, inactiveId, event) {
    // 기본 동작 방지
    event.preventDefault();

    var activeButton = document.getElementById(activeId);
    var inactiveButton = document.getElementById(inactiveId);

    activeButton.classList.add('buttonActive');
    activeButton.classList.remove('buttonNormal');
    inactiveButton.classList.remove('buttonActive');
    inactiveButton.classList.add('buttonNormal');

    // 숨겨진 입력 필드의 값 설정
    var boardTypeValue = activeId === 'freewrite' ? 'F' : 'R';
    document.getElementById('boardType').value = boardTypeValue;
    console.log("BoardType:", boardType)
}

function cancelAndRedirect() {
    // 사용자를 지정된 페이지로 리다이렉트
    window.location.href = 'http://localhost:8080/hanuldure/experiencepage';
}

window.addEventListener('DOMContentLoaded', (event) => {

    const boardType = document.getElementById('boardType').value;
    const freeButton = document.getElementById('freewrite');
    const recruitButton = document.getElementById('recruitment');

    if (boardType === 'F') {
        freeButton.classList.remove('buttonNormal');
        freeButton.classList.add('buttonActive');
    } else if (boardType === 'R') {
        recruitButton.classList.remove('buttonNormal');
        recruitButton.classList.add('buttonActive');
    }
});

function stopForm() {
    var boardType = document.getElementById('boardType').value;
    if (boardType === "") {
        alert("무슨 글 종류인지 선택해주세요.");
        return false;
    }
    return true;
}