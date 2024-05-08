fun letter_count(letter: Char, text: String): Int {
    return text.count { it == letter }
}

fun main(args: Array<String>) {
    val letter: Char = readLine()!![0]
    val text: String = readLine()!!
    val result = letter_count(letter, text)
    println(result)
}