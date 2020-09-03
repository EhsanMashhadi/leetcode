package easy

fun main() {
    val containsDuplicate = ContainsDuplicate()
    val result = containsDuplicate.run(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))
    println(result)
}

class ContainsDuplicate {

    fun run(nums: IntArray): Boolean {
        val hashSet = HashSet<Int>()
        for (num in nums) {
            if (!hashSet.add(num))
                return true
        }
        return false
    }
}