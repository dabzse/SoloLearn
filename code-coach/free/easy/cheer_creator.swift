if let input = readLine(), let yard = Int(input) {
    if yard > 10 {
        print("High Five")
    } else if yard < 1 {
        print("shh")
    } else {
        print(String(repeating: "Ra!", count: yard))
    }
}