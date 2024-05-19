function toggleButton(button) {
    if (button.classList.contains('buttonActive')) {
        // 이미 선택된 상태라면 원래 색상으로 변경
        button.classList.remove('buttonActive');
        button.classList.add('buttonNormal');
    } else {
        // 선택되지 않은 상태라면 선택된 색상으로 변경
        button.classList.remove('buttonNormal');
        button.classList.add('buttonActive');
    }
}