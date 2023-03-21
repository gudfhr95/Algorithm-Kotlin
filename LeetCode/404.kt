class Solution {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        var result = 0

        if (root == null) {
            return result
        }

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                result += root.left.`val`
            }
            result += sumOfLeftLeaves(root.left)
        }

        if (root.right != null) {
            result += sumOfLeftLeaves(root.right)
        }

        return result
    }
}