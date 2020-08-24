fun main() {
    val moveZeroes = MoveZeroes()
    val nums = intArrayOf(0,1,0,3,12)
    moveZeroes.run(nums)
    for (num in nums) {
        println(num)
    }
}

class MoveZeroes {
    fun run(nums: IntArray): Unit {
        for (i in 0..nums.size - 1) {
            if (nums[i] == 0)
                for (j in i..nums.size - 1) {
                    if (nums[j] != 0) {
                        val temp = nums[j]
                        nums[j] = 0
                        nums[i] = temp
                        break
                    }
                }
        }
    }
}