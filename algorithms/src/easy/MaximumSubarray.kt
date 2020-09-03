package easy

fun main() {
    val maximumSubarray = MaximumSubarray()
    val array = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val result = maximumSubarray.run(array)
    println(result)
}

class MaximumSubarray {

    fun run(nums: IntArray): Int {
        var maxSum = nums[0]
        var currentSum = nums[0]

        for (i in 1 until nums.size) {
            currentSum = Math.max(nums[i], currentSum + nums[i])
            maxSum = Math.max(currentSum, maxSum)
        }
        return maxSum
    }
}

