import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.log

fun main() {
    val powerOfThree = PowerOfThree()
    val result = powerOfThree.run(5)
    println(result)
}

class PowerOfThree {
    fun run(n: Int): Boolean {
        if (n <= 0) return false
        val result = log(n.toDouble(), 3.0)
        return !(abs(result - ceil(result)) > 0.0000000000001)
    }
}