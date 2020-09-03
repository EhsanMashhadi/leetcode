package easy

import java.util.*

fun main() {
    val symmetricTree = SymmetricTree()
    val tree = SymmetricTree.TreeNode(1)
    val left = SymmetricTree.TreeNode(2)
    val leftLeft = SymmetricTree.TreeNode(3)
    val leftRight = SymmetricTree.TreeNode(4)
    left.left = leftLeft
    left.right = leftRight

    val right = SymmetricTree.TreeNode(2)
    val rightLeft = SymmetricTree.TreeNode(4)
    val rightRight = SymmetricTree.TreeNode(3)
    right.left = rightLeft
    right.right = rightRight

    tree.left = left
    tree.right = right

    val result = symmetricTree.run(tree)
    println(result)
}

class SymmetricTree {
    var stack = Stack<TreeNode>()

    fun run(root: TreeNode?): Boolean {
        if (root == null)
            return true
        stack.push(root.left)
        stack.push(root.right)

        while (stack.isNotEmpty()) {
            val node1 = stack.pop()
            val node2 = stack.pop()
            if (node1 == null && node2 == null)
                continue
            if (node1 == null || node2 == null)
                return false
            if (node1.`val` != node2.`val`)
                return false
            stack.push(node1.left)
            stack.push(node2.right)
            stack.push(node2.left)
            stack.push(node1.right)
        }
        return true
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}

