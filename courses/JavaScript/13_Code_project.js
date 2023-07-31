// Trip Planner

function main() {
    var distance = parseInt(readLine(), 10);
    // your code goes here
    var speed = 40;
    var time = distance / speed;
    console.log(time * 60);
}