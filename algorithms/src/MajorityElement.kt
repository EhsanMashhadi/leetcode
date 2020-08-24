fun main() {
    val majorityElement = MajorityElement()
    val result = majorityElement.run1(intArrayOf(1, 2, 2, 2))
    println(result)
}

class MajorityElement {

    fun run(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        for (num in nums) {
            if (map[num] == null) {
                map[num] = 1
            } else {
                map[num] = map[num]!! + 1
            }
        }
        for (set in map) {
            if (set.value > nums.size / 2)
                return set.key
        }
        return -1
    }

    //Boyer-Moore Voting Algorithm
    fun run1(nums: IntArray): Int {

        var count = 0
        var candidate = 0

        for (num in nums) {
            if (count == 0) {
                candidate = num
            }
            count += if (num == candidate)
                1
            else
                -1
        }
        return candidate
    }
}