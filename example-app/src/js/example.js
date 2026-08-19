import { deviceInfo } from 'deviceinfo';

window.testEcho = () => {
    const inputValue = document.getElementById("echoInput").value;
    deviceInfo.echo({ value: inputValue })
}
