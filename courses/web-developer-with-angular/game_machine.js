// pro

let gameNumber = parseInt(readLine(), 10)

/**
  * 1. Shooter
  * 2. Puzzle
  * 3. Snake
  */

// complete the function
function run() {
    switch (gameNumber) {
        case 1:
            console.log("Shooter")
            break
        case 2:
            console.log("Puzzle")
            break
        case 3:
            console.log("Snake")
            break
    }
}

run(gameNumber)