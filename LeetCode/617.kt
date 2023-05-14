class Solution {
    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if(root1 == null && root2 == null){
            return null
        }

        var value =  root1?.`val` ?: 0
        value += root2?.`val` ?: 0

        val node = TreeNode(value)

        node.left = mergeTrees(root1?.left, root2?.left)
        node.right = mergeTrees(root1?.right, root2?.right)

        return node
    }
}