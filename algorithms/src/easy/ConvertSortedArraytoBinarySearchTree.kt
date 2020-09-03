package easy

fun main() {
    val array = intArrayOf(-10, -3, 0, 5, 9)
    val convertSortedArraytoBinarySearchTree = ConvertSortedArraytoBinarySearchTree()
    convertSortedArraytoBinarySearchTree.run(array)
}

class ConvertSortedArraytoBinarySearchTree {

    fun run(nums: IntArray): TreeNode? {
        return makeTree(nums = nums, start = 0, end = nums.size - 1)
    }

    private fun makeTree(nums: IntArray, start: Int, end: Int): TreeNode? {
        if (nums.isEmpty() || start > end) return null
        val mid = (start + end) / 2
        val node = TreeNode(nums[mid])
        node.left = makeTree(nums = nums, start = start, end = mid - 1)
        node.right = makeTree(nums = nums, start = mid + 1, end = end)
        return node
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}