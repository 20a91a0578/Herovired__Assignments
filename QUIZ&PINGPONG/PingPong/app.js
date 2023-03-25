function start()
{
    document.getElementById("start").style.display="none";
    const pLeft = document.getElementById('player1');
const pRight = document.getElementById('player2');
const ball = document.getElementById('ball');
const sLeft = document.getElementById('player1_points');
const sRight = document.getElementById('player2_points');

let xball= 290; 
let yball = 190;
let horizontal = 5; 
let vertical = 5;
let moveleft = 150; 
let moveright = 150;
let player1_score = 0; 
let player2_score = 0;

function update() {
    xball+= horizontal;
    yball += vertical;
    if (yball <= 0 || yball >= 385) {
        vertical = -vertical;
    }
    if (xball<= 30 && yball >= moveleft && yball <= moveleft + 70) {
        horizontal = -horizontal;
    }
    if (xball>= 560 && yball >= moveright && yball <= moveright + 70) {
        horizontal = -horizontal;
    }
    if (xball<= 0) {
        player2_score++;
        sRight.innerHTML = player2_score;
        if(player2_score==15)
        {
            alert('player2 is the winner');
            window.location.reload();
        }
        xball= 290;
        yball = 190;
        horizontal = -horizontal;
    }

    if (xball>= 585) {
        player1_score++;
        sLeft.innerHTML = player1_score;
        if(player1_score==15)
        {
            alert('player1 is the winner');
            window.location.reload();
        }
        xball= 290;
        yball = 190;
        horizontal = -horizontal;
    }
    ball.style.left = xball+ 'px';
    ball.style.top = yball + 'px';
    pLeft.style.top = moveleft + 'px';
    pRight.style.top = moveright + 'px';
}
function KeyDown(event) {
    if (event.keyCode === 87) {
        moveleft -= 10;
    }
    if (event.keyCode === 83) {
        moveleft += 10;
    }
    if (event.keyCode === 38) {
        moveright -= 10;
    }
    if (event.keyCode === 40) {
        moveright += 10;
    }
}
setInterval(update, 18); 
document.addEventListener('keydown', KeyDown);
}
