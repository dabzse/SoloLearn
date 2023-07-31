// The Math Object

function main() {
    var year = parseInt(readLine(), 10)

    // the output
    console.log(calcCent(year));

}

// complete the function
function calcCent(yr) {
    return Math.ceil(yr / 100)
}