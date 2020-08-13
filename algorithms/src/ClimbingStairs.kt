fun main() {
    val climbingStairs = ClimbingStairs()
    val result = climbingStairs.run2(5)
    println(result)
}

class ClimbingStairs {
    fun run(n: Int): Int {
        if (n == 1)
            return 1
        if (n == 2)
            return 2
        if (n == 3)
            return 3
        if (n == 4)
            return 5
        return run(n - 1) + run(n - 2)
    }

    fun run1(n: Int): Int {
        val array = IntArray(n + 1)
        return run11(n, array)
    }

    private fun run11(n: Int, array: IntArray): Int {
        if (n == 1)
            return 1
        if (n == 2)
            return 2
        if (array[n] > 0)
            return array[n]
        array[n] = run11(n - 1, array) + run11(n - 2, array)
        return array[n]
    }

    fun run2(n: Int): Int {
        if (n == 1 || n == 2)
            return n
        var first = 1
        var second = 2
        for (i in 3..n) {
            val third = first + second
            first = second
            second = third
        }
        return second
    }
}