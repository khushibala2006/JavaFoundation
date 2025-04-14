let gameSeq = [];
let userSeq = [];

let btns = ["yellow", "red", "blue", "green"];

let started = false;
let level = 0;

let h2 = document.querySelector("h2");

// Start the game on any key press
document.addEventListener("keypress", function () {
  if (started === false) {
    console.log("Game started");
    started = true; // fix: use = not ==
    levelUp();
  }
});

// Flash for game sequence
function btnFlash(btn) {
  btn.classList.add("flash");
  setTimeout(function () {
    btn.classList.remove("flash");
  }, 250);
}

// Flash for user click
function userFlash(btn) {
  btn.classList.add("user");
  setTimeout(function () {
    btn.classList.remove("user");
  }, 250);
}

// Level up logic
function levelUp() {
  userSeq = []; // Clear user sequence each new level
  level++;
  h2.innerText = `Level ${level}`;

  let randIndx = Math.floor(Math.random() * 4); // fix: should be 0–3
  let randClr = btns[randIndx]; // fix: use btns array
  let randBtn = document.querySelector(`.${randClr}`);
  gameSeq.push(randClr);
  btnFlash(randBtn);
}

// Check user's answer
function checkAns(idx) {
  if (userSeq[idx] === gameSeq[idx]) {
    if (userSeq.length === gameSeq.length) {
      setTimeout(levelUp, 1000);
    }
  } else {
    h2.innerHTML = `Game Over! Your score was <b>${level}</b> <br> Press any key to start.`;
    document.querySelector("body").style.backgroundColor = "red"; // fix typo
    setTimeout(function () {
      document.querySelector("body").style.backgroundColor = "white";
    }, 150);
    reset();
  }
}

// On button press
function btnPress() {
  let btn = this;
  let userColor = btn.getAttribute("id");
  userSeq.push(userColor);
  userFlash(btn);
  checkAns(userSeq.length - 1);
}

// Reset game
function reset() {
  started = false;
  gameSeq = [];
  userSeq = [];
  level = 0;
}

// Add event listeners to all buttons
let allBtns = document.querySelectorAll(".btn"); // fix: use querySelectorAll
for (let btn of allBtns) {
  btn.addEventListener("click", btnPress);
}