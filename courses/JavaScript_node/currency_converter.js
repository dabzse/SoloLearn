function convert(amount, rate) {
    return amount * rate;
}

function main() {
    var amount = parseFloat(readLine(), 10);
    var rate = parseFloat(readLine(), 10);

    console.log(convert(amount, rate));
}
