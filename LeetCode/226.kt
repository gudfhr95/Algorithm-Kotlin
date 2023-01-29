class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }

        val tempLeft = root.left
        val tempRight = root.right

        root.left = invertTree(tempRight)
        root.right = invertTree(tempLeft)

        return root
    }
}