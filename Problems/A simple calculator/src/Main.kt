import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextLong()
    val op = scanner.next()
    val num2 = scanner.nextLong()
    var result = ""

    when (op) {
        "+" -> result += num1 + num2
        "-" -> result += num1 - num2
        "/" -> {
            if (num2 == 0L) {
                result += "Division by 0!"
            } else {
                result += num1 / num2
            }
        }
        "*" -> result += num1 * num2
        else -> result += "Unknown operator"
    }
    println(result)
}
