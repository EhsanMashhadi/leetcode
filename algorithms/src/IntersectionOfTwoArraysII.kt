fun main() {
    val intersectionOfTwoArraysII = IntersectionOfTwoArraysII()
    val result = intersectionOfTwoArraysII.run1(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4))
    for (num in result)
        println(num)
}

class IntersectionOfTwoArraysII {

    fun run(nums1: IntArray, nums2: IntArray): IntArray {
        val arraylist = ArrayList<Int>()
        val map1 = HashMap<Int, Int>()
        val map2 = HashMap<Int, Int>()
        for (num in nums1)
            map1[num] = (map1.getOrPut(num) { 0 }) + 1
        for (num in nums2)
            map2[num] = (map2.getOrPut(num) { 0 }) + 1

        for ((key, value) in map1)
            if (map2.containsKey(key))
                for (i in 0 until Math.min(value, map2[key]!!))
                    arraylist.add(key)

        return arraylist.toIntArray()
    }

    fun run1(nums1: IntArray, nums2: IntArray): IntArray {
        val arraylist = ArrayList<Int>()
        val map1 = HashMap<Int, Int>()
        for (num in nums1)
            map1[num] = (map1.getOrPut(num) { 0 }) + 1

        for (num in nums2)
            if (map1.containsKey(num) && map1[num]!! > 0) {
                arraylist.add(num)
                map1[num] = map1[num]!! - 1
            }

        return arraylist.toIntArray()
    }
}