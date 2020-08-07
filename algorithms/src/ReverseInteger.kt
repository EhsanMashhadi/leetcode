fun main() {
    val reverseInteger = ReverseInteger()
    val result = reverseInteger.run1(1534236469)
    println(result)
}

class ReverseInteger {

    fun run(x: Int): Int {
        val string = x.toString()
        var reversed = string.reversed()
        if (reversed.endsWith("-")) {
            reversed = reversed.substring(0, reversed.length - 1)
            reversed = "-$reversed"
        }
        return try {
            val reveredInt = reversed.toInt()
            reveredInt
        } catch (exception: NumberFormatException) {
            0
        }
    }

    fun run1(x: Int): Int {
        var result: Long = 0
        var x1 = x
        while (x1 != 0) {
            val remain = x1 % 10
            x1 /= 10
            result = result * 10 + remain
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0
        }
        return result.toInt()
    }
}