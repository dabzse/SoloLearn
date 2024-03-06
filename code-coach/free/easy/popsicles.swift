let siblings = Int(readLine()!)!
let popsicles = Int(readLine()!)!

let result = popsicles % siblings
if popsicles > 0 && result == 0 {
    print("give away")
} else {
    print("eat them yourself")
}