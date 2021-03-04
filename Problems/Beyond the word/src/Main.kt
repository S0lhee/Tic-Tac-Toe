fun main() {
    // put your code here
    val inputArray = readLine()!!.toCharArray()
    var result = ""
    for (ch in 'a'..'z') {
        if (ch !in inputArray) {
            result += ch
        }
    }
    println(result)
}