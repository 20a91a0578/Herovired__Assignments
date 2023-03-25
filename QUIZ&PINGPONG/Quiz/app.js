const quiz = [
  {
    question: "1.India's First ODI match against?",
    opt: ["South Africa","Australia", "Pakistan", "England"],
    answer: "England"
  },
  {
    question: "2.Which team correctansd highest runs in IPL till now ?",
    opt: ["RCB","CSK","MI","RR"],
    answer: "RCB"
  },
  {
    question: "3. Which team won the first IPL final?",
    opt: ["RR","CSK","MI","KKR"],
    answer: "RR"
  },
  {
    question: "4.Which team Won most IPL tournaments ?",
    opt: ["MI","CSK","KKR","SRH"],
    answer: "MI"
  },
  {
    question: "5.Who correctansd the highest individual correctans in IPL ?",
    opt: ["Chris Gayle","Quinton de Kock","AB de Villiers","Rohit Sharma"],
    answer: "Chris Gayle"
  }
];

const quizContainer = document.getElementById("main");
const Question = document.getElementById("quest");
const Option = document.getElementById("opt");
const Submit = document.getElementById("submit");
const Result = document.getElementById("outcome");
const Reload = document.getElementById("restart");
Reload.style.display="none";
let currentquest = 0;
let correctans = 0;

function QuestionEnable() {
  const question = quiz[currentquest].question;
  const opt = quiz[currentquest].opt;
  Question.textContent = question;
  Option.innerHTML = "";
  for (let i = 0; i < opt.length; i++) {
    const choice = opt[i];
    const radio = document.createElement("input");
    radio.type = "radio";
    radio.name = "choice";
    radio.value = choice;
    Option.appendChild(radio);
    const label = document.createElement("label");
    label.textContent = choice;
    Option.appendChild(label);
  }
}

function SubmitAns() {
  const selected = document.querySelector('input[name="choice"]:checked');
  if (!selected) {
    alert("Please select an answer");
    return;
  }
  const answer = selected.value;
  if (answer === quiz[currentquest].answer) {
    correctans++;
  }
  currentquest++;
  if (currentquest === quiz.length) {
    FinalResult();
    
  } else {
    QuestionEnable();
  }
}

function FinalResult() {
  quizContainer.style.display = "none";
  Result.style.display = "block";
  Result.textContent = `Your correctans is ${correctans} out of ${quiz.length}`;
  Reload.style.display="block";
  
}

function Reloadpage() {
  window.location.reload();
}

QuestionEnable();
Submit.addEventListener("click", SubmitAns);
Reload.addEventListener("click", Reloadpage);
