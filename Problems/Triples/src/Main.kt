fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    var numbers = IntArray(n)
    var result = 0
    for (i in 0 .. n - 1) {
        numbers[i] = readLine()!!.toInt()
    }
    for (i in 0 .. n - 3) {
        if (numbers[i] == numbers[i+1] - 1) {
            if (numbers[i+1] == numbers[i+2] - 1) {
                result ++
            }
        }
    }

    println(result)

}