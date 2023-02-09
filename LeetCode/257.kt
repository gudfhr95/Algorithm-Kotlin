class Solution {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        if (root == null) {
            return emptyList()
        }

        return dfs(root, listOf(root.`val`))
    }

    fun dfs(node: TreeNode?, path: List<Int>): List<String> {
        if (node == null) {
            return emptyList()
        }

        if (node.left == null && node.right == null) {
            return listOf(path.joinToString("->"))
        }

        var result = emptyList<String>()
        if (node.left != null) {
            result = result + dfs(node.left, path + node.left.`val`)
        }

        if (node.right != null) {
            result = result + dfs(node.right, path + node.right.`val`)
        }

        return result
    }
}