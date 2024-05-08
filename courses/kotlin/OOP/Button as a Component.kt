open class Component(var width: Int, var height: Int) {
    open fun draw() {
        println("$width x $height")
    }
}

class Image(width: Int, height: Int) : Component(width, height) {
    override fun draw() {
        println("$width" + "x" + "$height")
    }
}

class Button(width: Int, height: Int) {
    var name: String = "Button"
    fun tap() {
        println(name + " was tapped")
    }
}

fun main(args: Array<String>) {
    val b1 = Button(200, 50)
    b1.tap()

    val img = Image(300, 500)
    img.draw()
}