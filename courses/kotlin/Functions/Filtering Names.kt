fun main(args: Array<String>) {
    var letter = readLine()!![0]
    val names = arrayOf("John", "David", "Amy", "James", "Amanda", "Dave", "Bob", "Billy", "Bobby", "Diana", "Lenny", "Gina")
    val res = names.filter { it.first() == letter }
    println(res.joinToString("\n"))
}