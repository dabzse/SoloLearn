let scores = [68,95,54,84,77,75,63,74,69,80,71,63];

// your code goes here
var count = 0;
for (let s of scores) {
    if (s >= 70) {
        count++
    }
}

console.log(count);

/**
 * but you can do it a bit easier way

var count = 0;
for (let s of scores)
    if (s >= 70)
        count++

console.log(count)

 */