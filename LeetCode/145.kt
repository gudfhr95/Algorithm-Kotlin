class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) {
            return emptyList()
        }

        return postorderTraversal(root.left) + postorderTraversal(root.right) + listOf(root.`val`)
    }
}