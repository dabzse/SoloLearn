fun main(args: Array<String>) {
    var age = readLine()!!.toInt()

    if (age < 0)
        println("Invalid age")
    else if (age <= 11)
        println("Child")
    else if (age <= 17)
        println("Teen")
    else if (age <= 64)
        println("Adult")
    else
        println("Senior")
}