fun main() {
    val string = readLine()!!
    var isPalindrome = true
    for (i in 0..(string.length / 2)) {
        if (string[i] != string[string.length - i - 1]) {
            isPalindrome = false
        }
    }
    if (isPalindrome) {
        println("yes")
    } else {
        println("no")
    }
}