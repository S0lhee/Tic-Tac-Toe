fun main() {
    val input = readLine()!!
    for (ch in input.toCharArray()) {
        if (ch.isDigit()) {
            println(ch)
            break
        }
    }
}