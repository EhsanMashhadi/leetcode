package easy

fun main() {
    val sqrt = SqrtX()
    val result = sqrt.run(9)
    println(result)
}

class SqrtX {

    fun run(x: Int): Int {
        if (x == 0) {
            return 0
        }
        var lastValue = 1
        for (i in 1..(x / 2) + 1) {
            val sum = i * i
            when {
                sum == x -> {
                    return i
                }
                sum < 0 || sum > x -> {
                    return lastValue
                }
                else -> {
                    lastValue = i
                }
            }
        }
        return lastValue
    }
}