fun main() {
    val singleNumber = SingleNumber()
    val result = singleNumber.run1(intArrayOf(4, 1, 2, 1, 2, 4, 5))
    println(result)
}

class SingleNumber {

    fun run(nums: IntArray): Int {
        val map = HashMap<Int, String>()
        for (num in nums) {
            if (map.containsKey(num)) {
                map.remove(num)
            } else {
                map[num] = num.toString()
            }
        }
        return map.keys.elementAt(0)
    }

    fun run1(nums: IntArray): Int {
        var result = 0
        for (num in nums) {
            result = result.xor(num)
        }
        return result
    }
}