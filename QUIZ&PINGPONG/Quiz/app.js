// const quizData = [
//     {
//       question: "What is the capital of India?",
//       options: [
//         "Mumbai",
//         "New Delhi",
//         "Kolkata",
//         "Chennai"
//       ],
//       answer: "New Delhi"
//     },
//     {
//       question: "Who is the CEO of Tesla Motors?",
//       options: [
//         "Bill Gates",
//         "Steve Jobs",
//         "Elon Musk",
//         "Tony Stark"
//       ],
//       answer: "Elon Musk"
//     },
//     {
//       question: "Which is the highest mountain peak in the world?",
//       options: [
//         "Mount Everest",
//         "Mount Kilimanjaro",
//         "Mount Fuji",
//         "Mount K2"
//       ],
//       answer: "Mount Everest"
//       },
//       {
//       question: "Who is the author of Harry Potter series?",
//       options: [
//       "J.K. Rowling",
//       "Stephen King",
//       "Dan Brown",
//       "Suzanne Collins"
//       ],
//       answer: "J.K. Rowling"
//       },
//       {
//       question: "What is the national animal of India?",
//       options: [
//       "Lion",
//       "Tiger",
//       "Leopard",
//       "Elephant"
//       ],
//       answer: "Tiger"
//       }
//       ];
      
//       const quiz = document.getElementById("quiz");
//       const questionElement = document.getElementById("question");
//       const optionsElement = document.getElementById("options");
//       const Submit = document.getElementById("submit");
//       const resultElement = document.getElementById("result");
//       const restartButton = document.getElementById("restart");
      
//       let currentquestIndex = 0;
//       let correctans = 0;
      
//       function QuestionEnable() {
//       const currentquest = quizData[currentquestIndex];
//       questionElement.innerText = currentquest.question;
//       optionsElement.innerHTML = "";
//       for (let i = 0; i < currentquest.options.length; i++) {
//       const option = currentquest.options[i];
//       const optionElement = document.createElement("div");
//       optionElement.classList.add("option");
//       const inputElement = document.createElement("input");
//       inputElement.setAttribute("type", "radio");
//       inputElement.setAttribute("name", "option");
//       inputElement.setAttribute("value", option);
//       const labelElement = document.createElement("label");
//       labelElement.innerText = option;
//       optionElement.appendChild(inputElement);
//       optionElement.appendChild(labelElement);
//       optionsElement.appendChild(optionElement);
//       }
//       }
      
//       function checkAnswer() {
//       const selectedOption = document.querySelector('input[name="option"]:checked');
//       if (!selectedOption) {
//       return false;
//       }
//       return selectedOption.value === quizData[currentquestIndex].answer;
//       }
      
//       function updatecorrectans() {
//       if (checkAnswer()) {
//       correctans++;
//       }
//       }
      
//       function FinalResult() {
//       quiz.style.display = "none";
//       resultElement.innerHTML = "You correctansd <span>${correctans}</span> out of <span>${quizData.length}</span>.";
//       restartButton.style.display = "block";
//       }
      
//       function restartQuiz() {
//       quiz.style.display = "block";
//       resultElement.innerHTML = "";
//       restartButton.style.display = "none";
//       currentquestIndex = 0;
//       correctans = 0;
//       QuestionEnable();
//       }
      
//       Submit.addEventListener("click", function() {
//       if (checkAnswer()) {
//       updatecorrectans();
//       }
//       currentquestIndex++;
//       if (currentquestIndex < quizData.length) {
//       QuestionEnable();
//       } else {
//       FinalResult();
//       }
//       });
      
//       restartButton.addEventListener("click", function() {
//       restartQuiz();
//       });
      
//       QuestionEnable();
//       restartButton.addEventListener("click", function() {
//         restartQuiz();});
      

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