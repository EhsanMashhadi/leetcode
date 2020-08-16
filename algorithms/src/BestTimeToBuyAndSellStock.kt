fun main() {
    val bestTimeToBuyAndSellStock = BestTimeToBuyAndSellStock()
    val input = intArrayOf(7, 6, 5, 4)
    val result = bestTimeToBuyAndSellStock.run(input)
    println(result)
}

class BestTimeToBuyAndSellStock {

    fun run(prices: IntArray): Int {
        if (prices.isEmpty())
            return 0
        var min = prices[0]
        var max = -1

        for (price in prices) {
            if (price < min)
                min = price
            if (price - min > max)
                max = price - min
        }
        return max
    }

    fun run1(prices: IntArray): Int {
        var maxProfit = 0
        for (i in prices.indices) {
            for (j in i until prices.size)
                if (prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i]
                }
        }
        return maxProfit
    }
}