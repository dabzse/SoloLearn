let adults = 7;
let children = 13;

function calc(adults, children) {
    return adults*12 + children*5;
}


for(let i=1; i<=adults; i++) {
  console.log("Ticket #" + i);
}


let price = calc(adults, children);
console.log(price);


window.onload = function() {
  let btn = document.getElementById("buyBtn");
  btn.onclick = function() {
    let adults = parseInt(document.getElementById("adults").value);
    let children = parseInt(document.getElementById("children").value);
    let price = calc(adults, children);
    alert(price);
  }
}
