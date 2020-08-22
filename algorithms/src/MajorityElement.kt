fun main() {
    val majorityElement = MajorityElement()
    val result = majorityElement.run(intArrayOf(1,2,2,2))
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
}