let scores = [68, 95, 54, 84, 77, 75, 63, 74, 69, 80, 71, 63];

// your code goes here
let passing_score = 70;
let pass_count = 0;

for (let score of scores) {
    if (score >= passing_score) {
        pass_count++;
    }
}

console.log(pass_count);