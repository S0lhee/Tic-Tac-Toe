fun main() {
    // write your code here
    val string = readLine()!!
    var isSubApb = true
    var formerCh = string[0]
    for (i in 1 until string.length) {
        formerCh++
        if (formerCh != string[i]) {
            isSubApb = false
        }
    }
    println(isSubApb)
}