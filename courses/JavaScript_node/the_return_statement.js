function main() {
    var num1 = parseInt(readLine(),10);
    var num2 = parseInt(readLine(),10);
    var num3 = parseInt(readLine(),10);

    var average;

    // assign the average value to the variable average
    average = avg(num1, num2, num3);
    console.log(average)
}

// complete the function
function avg(num1, num2, num3) {
    return (num1 + num2 + num3) / 3;
}