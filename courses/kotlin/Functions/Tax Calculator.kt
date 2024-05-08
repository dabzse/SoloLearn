fun calc(price: Double) {
    var tax = price * 0.15
    var total = price + tax
    println(total)
    return
}

fun main(args: Array<String>) {
    val price = readLine()!!.toDouble()
    calc(price)
}