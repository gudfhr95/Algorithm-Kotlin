class Solution {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if(root == null){
            return 0
        }

        val result = getDepth(root)

        return result.first
    }

    fun getDepth(root: TreeNode?): Pair<Int, Int> {
        if(root == null){
            return Pair(0, 0)
        }

        val left = getDepth(root.left)
        val right = getDepth(root.right)
        val m = Math.max(left.first, right.first)

        return Pair(Math.max(m, left.second + right.second), 1 + Math.max(left.second, right.second))
    }
}