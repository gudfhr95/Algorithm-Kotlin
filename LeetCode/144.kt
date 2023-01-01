class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) {
            return emptyList()
        }

        var result = listOf(root.`val`)
        result += preorderTraversal(root.left)
        result += preorderTraversal(root.right)

        return result
    }
}