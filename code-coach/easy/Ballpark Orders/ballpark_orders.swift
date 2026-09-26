import Foundation

let menu: [String: Double] = [
    "Nachos": 6.0,
    "Pizza": 6.0,
    "Cheeseburger": 10.0,
    "Water": 4.0,
    "Coke": 5.0
]

if let order = readLine()?.split(separator: " ") {
    var total: Double = 0.0

    for item in order {
        if let price = menu[String(item)] {
            total += price
        }
        else {
            total += menu["Coke"] ?? 0.0
        }
    }

    let tax = total * 0.07
    let final_total = total + tax
    print(String(format: "%.2f", final_total))
}
