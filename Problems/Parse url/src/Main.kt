fun main() {
    val url = readLine()!!
    val params = url.substringAfter("?").split("&")
    var hasPass = false
    var password = ""

    for (param in params) {
        val name = param.substringBefore("=")
        var value = param.substringAfter("=")
        if (value == "") {
            value = "not found"
        }
        if (name == "pass") {
            hasPass = true
            password = value
        }
        println("$name : $value")
    }
    if (hasPass) {
        println("password : $password")
    }

}