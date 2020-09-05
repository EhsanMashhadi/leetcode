package medium

fun main() {
    val subsets = Subsets()
    val result = subsets.run1(intArrayOf(1, 2, 3))
    for (i in result) {
        for (j in i)
            print(j)
        println()
    }
}

class Subsets {

    fun run(nums: IntArray): List<List<Int>> {
        if (nums.isEmpty()) return ArrayList<ArrayList<Int>>()
        val map = HashMap<String, MutableList<Int>>()
        val mutableList = nums.toMutableList()
        while (map.keys.size.toDouble() != Math.pow(2.0, nums.size.toDouble()) - 1) {
            for (i in 1..nums.size) {
                val number = factorial(nums.size) / (factorial(i) * factorial(nums.size - i))
                var needed = map.keys.filter { it.split(",").size == i }
                while (needed.size != number.toInt()) {
                    mutableList.shuffle()
                    val sublist = mutableList.subList(0, i).sorted().toString().replace("[", "").replace("]", "")
                    if (!map.keys.contains(sublist)) {
                        map[sublist] = mutableList.subList(0, i).sorted().toMutableList()
                    }
                    needed = map.keys.filter { it.split(",").size == i }
                }
            }
        }
        map[""] = ArrayList()
        return map.values.toList()
    }

    private fun factorial(n: Int): Long {
        var factorial: Long = 1
        for (i in 1..n)
            factorial *= i
        return factorial
    }

    fun run1(nums: IntArray): List<List<Int>> {
        val start = Math.pow(2.0, nums.size.toDouble()).toInt()
        val end = (Math.pow(2.0, nums.size.toDouble() + 1)).toInt()
        val list = ArrayList<ArrayList<Int>>()
        for (i in start..end - 1) {
            val number = Integer.toBinaryString(i).substring(1)
            val numbers = ArrayList<Int>()
            for (j in 0..number.length - 1)
                if (number[j] == '1')
                    numbers.add(nums[j])
            list.add(numbers)
        }
        return list
    }
}