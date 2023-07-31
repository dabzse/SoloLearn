// The else if statement

var score = parseInt(readLine(), 10)
/**
    88 and above => excellent
    40-87 => good
    0-39 => fail
*/
// your code goes here

if(score >= 88)
    console.log("excellent")
else if(score >= 40 && score < 88)
    console.log("good")
else
    console.log("fail")