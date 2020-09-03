package easy

fun main() {
    val rotateArray = RotateArray()
    val array = intArrayOf(-1, -100, 3, 99)
    rotateArray.run(array, 2)
    for (value in array)
        println(value)
}

class RotateArray {

    fun run(nums: IntArray, k: Int): Unit {
        if (nums.isNotEmpty()) {
            val rotateValue = k % nums.size
            val result = nums.sliceArray(IntRange(nums.size - rotateValue, nums.size - 1)) +
                    nums.sliceArray(IntRange(0, nums.size - 1 - rotateValue))
            for (i in result.indices) {
                nums[i] = result[i]
            }
        }
    }

    fun run1(nums: IntArray, k: Int): Unit {
        if (nums.isNotEmpty()) {
            for (i in 1..k) {
                val temp = nums[nums.size - 1]
                for (j in nums.size - 1 downTo 1) {
                    val temp = nums[j]
                    nums[j] = nums[j - 1]
                    nums[j - 1] = temp
                }
                nums[0] = temp
            }
        }
    }
}