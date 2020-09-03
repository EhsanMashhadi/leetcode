package easy

fun main() {
    val bestTimeToBuyAndSellStock2 = BestTimeToBuyAndSellStockII()
    val input = intArrayOf(7, 1, 5, 3, 6, 4)
    val result = bestTimeToBuyAndSellStock2.run(input)
    println(result)
}

class BestTimeToBuyAndSellStockII {
    fun run(prices: IntArray): Int {
        var profit = 0
        var i = 0
        while (i < prices.size - 1) {
            while (i < prices.size - 1 && prices[i + 1] <= prices[i]) {
                i++
            }
            val valley = prices[i]
            while (i < prices.size - 1 && prices[i + 1] >= prices[i]) {
                i++
            }
            val peak = prices[i]

            profit += peak - valley
        }
        return profit
    }
}