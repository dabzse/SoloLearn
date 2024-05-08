fun main(args: Array<String>) {
    var count = 0
    while(true) {
        var input = readLine()!!.toInt()
        if (input == 0)
            break
        else
            count++
    }
    println(count)
}