fun main() {
    val input = readLine()!!
    var resultArray = arrayOf(input.toCharArray())
    if (input.isEmpty()) {
        println("")
    } else {
        when (input.first()) {
            'i' -> {
                println(input.drop(1).toInt() + 1)
            }
            's' -> {
                println(input.drop(1).reversed())
            }
            else -> {
                println(input)
            }
        }
    }
}