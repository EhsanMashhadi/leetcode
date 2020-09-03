package easy

fun main() {
    val missingNumber = MissingNumber()
    val result = missingNumber.run(intArrayOf(0, 1))
    println(result)
}

class MissingNumber {

    fun run(nums: IntArray): Int {
        val expectedSum = (nums.size * (nums.size + 1)) / 2
        val sum = nums.sum()
        return expectedSum - sum
    }
}