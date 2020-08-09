fun main() {
    val removeDuplicatesFromSortedArray = RemoveDuplicatesFromSortedArray()
    val array = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val result = removeDuplicatesFromSortedArray.run(array)
    println("Length: $result")
    for (int in array) {
        println(int)
    }
}

class RemoveDuplicatesFromSortedArray {
    fun run(nums: IntArray): Int {
        if (nums.isNotEmpty()) {
            var lastValue = nums[0]
            var lastIndex = 0
            for (i in 1 until nums.size) {
                if (nums[i] != lastValue) {
                    lastIndex++
                    lastValue = nums[i]
                    nums[lastIndex] = nums[i]
                }
            }
            return lastIndex + 1
        }
        return 0
    }
}