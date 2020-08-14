fun main() {
    val maximumDepthofBinaryTree = MaximumDepthofBinaryTree()
    val tree = MaximumDepthofBinaryTree.TreeNode(1)
    val left = MaximumDepthofBinaryTree.TreeNode(2)
    val leftLeft = MaximumDepthofBinaryTree.TreeNode(3)
    val leftRight = MaximumDepthofBinaryTree.TreeNode(4)
    left.left = leftLeft
    left.right = leftRight

    val right = MaximumDepthofBinaryTree.TreeNode(2)
    val rightLeft = MaximumDepthofBinaryTree.TreeNode(4)
    val rightRight = MaximumDepthofBinaryTree.TreeNode(3)
    right.left = rightLeft
    right.right = rightRight

    tree.left = left
    tree.right = right
    val result = maximumDepthofBinaryTree.run(tree)
    println(result)
}

class MaximumDepthofBinaryTree {

    fun run(root: TreeNode?): Int {
        if (root == null)
            return 0
        if (root.left == null && root.right == null)
            return 1
        return 1 + Math.max(run(root.left), run(root.right))
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}