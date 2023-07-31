// The return Statement

function main() {
    var num1 = parseInt(readLine(),10);
    var num2 = parseInt(readLine(),10);
    var num3 = parseInt(readLine(),10);

    // assign the average value to the variable average
    var average = avg(num1, num2, num3);

    console.log(average)
}

// complete the function
function avg(x, y, z) {
    return (x + y + z) / 3
}