// complete the function
function Add() {
    let sum = 0;
    for (let num of arguments) {
        sum += num;
    }
    return sum;
}

console.log(Add(1,2,3));
console.log(Add(4,14,5,9,14));
console.log(Add(2, 36));
