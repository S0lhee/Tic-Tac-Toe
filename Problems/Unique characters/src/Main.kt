fun main() {
    val alpCount = IntArray(26)
    val input = readLine()!!
    for (ch in input) {
        alpCount[ch.toInt()-'a'.toInt()] ++
    }
    var numOfOnlyCh = 0
    for (count in alpCount) {
        if (count == 1) {
            numOfOnlyCh ++
        }
    }
    println(numOfOnlyCh)
}