package medium

fun main() {
    val permutations = Permutations()
    val result = permutations.run1(intArrayOf(1, 2, 3))
    for (i in result) {
        for (j in i)
            print(j)
        println()
    }
}

class Permutations {

    fun run(nums: IntArray): List<List<Int>> {
        val permutations = ArrayList<ArrayList<Int>>()
        if (nums.isEmpty())
            return permutations
        permute(nums = nums, permutation = ArrayList(), permutations = permutations, start = 0)
        return permutations
    }

    private fun permute(
        nums: IntArray,
        permutation: ArrayList<Int>,
        permutations: ArrayList<ArrayList<Int>>,
        start: Int
    ) {
        if (permutation.size == nums.size) {
            permutations.add(permutation)
            return
        }
        for (i in 0..permutation.size) {
            val newPermutation = ArrayList<Int>(permutation)
            newPermutation.add(i, nums[start])
            permute(nums, newPermutation, permutations, start + 1)
        }
    }

    fun run1(nums: IntArray): List<List<Int>> {
        val map = HashMap<String, MutableList<Int>>()
        var factorial: Long = 1
        for (i in 1..nums.size)
            factorial *= i
        val mutableList = nums.toMutableList()
        while (map.keys.size.toLong() != factorial) {
            mutableList.shuffle()
            if (!map.keys.contains(mutableList.toString())) {
                map[mutableList.toString()] = mutableList.toMutableList()
            }
        }
        return map.values.toList()
    }
}