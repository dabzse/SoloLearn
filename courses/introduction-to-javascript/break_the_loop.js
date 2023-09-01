let num = 1;

for(i = 1; i <= 100; i++) {
    num *= i;
    // your code goes here
    if(num > 10000) {
        break;
    }
}
// generate the result
console.log(num);
