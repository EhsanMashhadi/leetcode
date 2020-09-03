package easy

fun main() {
    val countPrimes = CountPrimes()
    val result = countPrimes.run(3)
    println(result)
}

class CountPrimes {

    fun run(n: Int): Int {
        var result = 0
        for (i in 2..n - 1)
            if (isPrime(i))
                result++

        return result
    }

    private fun isPrime(n: Int): Boolean {
        if (n == 2) return true
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0)
                return false
        }
        return true
    }
}