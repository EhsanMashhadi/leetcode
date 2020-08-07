fun main() {
    val twoSum = TwoSum()
    val array = intArrayOf(2, 7, 11, 15)
    val result = twoSum.twoSum(array, 9)
    for (value in result) {
        print(value)
    }
}

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = HashMap<Int, Int>()
        val indices = IntArray(2)

        for (i in nums.indices) {
            if (map.keys.contains(nums[i])) {
                indices[0] = map[nums[i]]!!
                indices[1] = i
                return indices
            } else {
                map[target - nums[i]] = nums.indexOf(nums[i])
            }
        }
        return indices
    }
}