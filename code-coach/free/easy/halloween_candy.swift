import Foundation

if let input = readLine(), let houses = Double(input) {
    let value = 2 * 100 / houses
    print(Int(ceil(value)))
}