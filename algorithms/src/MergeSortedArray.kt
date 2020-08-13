fun main() {
    val mergeSortedArray = MergeSortedArray()
    val num1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val num2 = intArrayOf(2, 5, 6)
    mergeSortedArray.run(num1, 3, num2, 3)
    for (value in num1) {
        print(value)
    }
}

class MergeSortedArray {

    fun run(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val num3 = IntArray(m + n)
        var i = 0
        var j = 0
        var index = 0
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                num3[index] = nums1[i]
                i++
            } else {
                num3[index] = nums2[j]
                j++
            }
            index++
        }

        while (i < m) {
            num3[index] = nums1[i]
            i++
            index++
        }
        while (j < n) {
            num3[index] = nums2[j]
            j++
            index++
        }
        for (i in 0..num3.size - 1) {
            nums1[i] = num3[i]
        }
    }
}