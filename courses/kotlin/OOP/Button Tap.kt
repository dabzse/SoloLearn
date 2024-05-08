class Button(var width: Int, var height: Int) {
    // your code goes here
    var name: String? = null
    fun tap() {
        println("$name was tapped")
    }
}

fun main(args: Array<String>) {
    val b1 = Button(200, 50)
    b1.name = readLine()!!

    b1.tap()
}