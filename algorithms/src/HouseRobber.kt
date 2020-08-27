fun main() {
    val houseRubber = HouseRobber()
    val result = houseRubber.run(intArrayOf(2, 7, 9, 3, 1))
    println(result)
}

class HouseRobber {

    fun run(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]
        val result = IntArray(nums.size)
        result[0] = nums[0]
        result[1] = Math.max(nums[0], nums[1])
        for (i in 2 until nums.size) {
            result[i] = Math.max(nums[i] + result[i - 2], result[i - 1])
        }
        return result[result.size - 1]
    }
}