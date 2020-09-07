package medium

fun main() {
    val topKFrequentElements = TopKFrequentElements()
    val result = topKFrequentElements.run(intArrayOf(1, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4), 2)
    for (value in result)
        println(value)
}

class TopKFrequentElements {

    fun run(nums: IntArray, k: Int): IntArray {

        val array = IntArray(k)
        val map = HashMap<Int, Int>()

        for (num in nums) {
            if (map.containsKey(num)) map[num] = map[num]!! + 1
            else map[num] = 1
        }

        for (i in 0 until k) {
            var maxValue = Integer.MIN_VALUE
            var maxKey = -1
            for (key in map.keys) {
                val current = map[key]!!
                if (current > maxValue) {
                    maxKey = key
                    maxValue = current
                }
            }
            array[i] = maxKey
            map.remove(maxKey)
        }
        return array
    }
}