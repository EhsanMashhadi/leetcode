package medium

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val binaryTreeInorderTraversal = BinaryTreeInorderTraversal()
    val tree = BinaryTreeInorderTraversal.TreeNode(1)
    tree.left = BinaryTreeInorderTraversal.TreeNode(2)
    tree.left!!.left = BinaryTreeInorderTraversal.TreeNode(4)
    tree.left!!.right = BinaryTreeInorderTraversal.TreeNode(5)

    val rightNode = BinaryTreeInorderTraversal.TreeNode(3)
    tree.right = rightNode

    val result = binaryTreeInorderTraversal.run1(tree)
    for (num in result)
        println(num)
}

class BinaryTreeInorderTraversal {

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    private val list = ArrayList<Int>()
    fun run(root: TreeNode?): List<Int> {
        if (root != null) {
            run(root.left)
            list.add(root.`val`)
            run(root.right)
        }
        return list
    }

    private val stack = Stack<TreeNode>()

    fun run1(root: TreeNode?): List<Int> {
        var current = root
        while (current != null || stack.isNotEmpty()) {
            while (current != null) {
                stack.push(current)
                current = current.left
            }
            current = stack.pop()
            list.add(current.`val`)
            current = current!!.right
        }
        return list
    }
}