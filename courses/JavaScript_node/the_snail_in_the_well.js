function main() {
    var depth = parseInt(readLine(), 10)
    // your code goes here
    var days = 0
    var distance = 0
    while (distance < depth) {
        distance += 7
        days++
        if (distance >= depth) {
            break
        }
        distance -= 2
    }
    console.log(days)
}
