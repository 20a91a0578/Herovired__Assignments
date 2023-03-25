const pLeft = document.getElementById('paddleleft');
const pRight = document.getElementById('paddleright');
const ball = document.getElementById('ball');
const sLeft = document.getElementById('scoreleft');
const sRight = document.getElementById('scoreright');

let ballX = 290; 
let ballY = 190;
let ballSpeedX = 5; 
let ballSpeedY = 5;
let paddleLeftY = 150; 
let paddleRightY = 150;
let scoreLeftValue = 0; 
let scoreRightValue = 0;

function update() {
    ballX += ballSpeedX;
    ballY += ballSpeedY;
    if (ballY <= 0 || ballY >= 385) {
        ballSpeedY = -ballSpeedY;
    }
    if (ballX <= 30 && ballY >= paddleLeftY && ballY <= paddleLeftY + 70) {
        ballSpeedX = -ballSpeedX;
    }
    if (ballX >= 560 && ballY >= paddleRightY && ballY <= paddleRightY + 70) {
        ballSpeedX = -ballSpeedX;
    }
    if (ballX <= 0) {
        scoreRightValue++;
        sRight.innerHTML = scoreRightValue;
        ballX = 290;
        ballY = 190;
        ballSpeedX = -ballSpeedX;
    }

    if (ballX >= 585) {
        scoreLeftValue++;
        sLeft.innerHTML = scoreLeftValue;
        ballX = 290;
        ballY = 190;
        ballSpeedX = -ballSpeedX;
    }
    ball.style.left = ballX + 'px';
    ball.style.top = ballY + 'px';
    pLeft.style.top = paddleLeftY + 'px';
    pRight.style.top = paddleRightY + 'px';
}
function onKeyDown(event) {
    if (event.keyCode === 87) {
        paddleLeftY -= 10;
    }
    if (event.keyCode === 83) {
        paddleLeftY += 10;
    }
    if (event.keyCode === 38) {
        paddleRightY -= 10;
    }
    if (event.keyCode === 40) {
        paddleRightY += 10;
    }
}
setInterval(update, 15); 
document.addEventListener('keydown', onKeyDown);