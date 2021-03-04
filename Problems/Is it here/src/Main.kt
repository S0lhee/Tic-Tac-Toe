fun main() {
    val n = readLine()!!.toInt()
    var numbers = IntArray(n)
    for (i in 0 until n) {
        numbers[i] = readLine()!!.toInt()
    }
    val targetN = readLine()!!.toInt()
    var found = false
    for (num in numbers) {
        if (num == targetN) {
            found = true
        }
    }
    if (found) {
        println("YES")
    } else {
        println("NO")
    }
}