fun main() {
    var inputArray : MutableList<List<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ')
        inputArray.add(strings)
    }
    //Write your code here
    println( inputArray[2].joinToString())

}