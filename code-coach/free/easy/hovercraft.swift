if let input = readLine(), let sales = Int(input) {
    let invest = 10 * 2000_000 + 1000_000
    let monthly = sales * 3000_000

    if monthly < invest {
        print("Loss")
    }
    else if monthly == invest {
        print("Broke Even")
    }
    else {
        print("Profit")
    }
}