fun main(args: Array<String>) {
    var arr = arrayOf("James", "Amy", "Sam", "Olie", "Bob")
    val res = arr.joinToString("") { it.first().toString() }
    println(res)
}