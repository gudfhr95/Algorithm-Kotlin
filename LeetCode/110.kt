class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }

        return (Math.abs(height(root.left) - height(root.right)) <= 1) &&
                isBalanced(root.left) &&
                isBalanced(root.right)
    }

    fun height(node: TreeNode?): Int {
        if (node == null) {
            return 0
        }

        return 1 + Math.max(height(node?.left), height(node?.right))
    }
}