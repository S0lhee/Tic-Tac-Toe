import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val nums = IntArray(n)
    var result = false
    for (i in 0..n - 1) {
        nums[i] = scanner.nextInt()
    }
    val p = scanner.nextInt()
    val m = scanner.nextInt()

    if (nums[0] == p && nums[1] == m) {
        result = true
    }else if (nums[n-1] == p && nums[n-2] == m){
        result = true
    } else {
        for (i in 1..n - 2) {
            if (nums[i] == p) {
                if (nums[i+1] == m || nums[i-1] == m) {
                    result = true
                }
            }
        }
    }

    if (result) {
        println("YES")
    } else {
        println("NO")
    }

}