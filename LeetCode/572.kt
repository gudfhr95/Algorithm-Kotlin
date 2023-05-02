class Solution {
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if(root == null){
            return false
        }

        return isSame(root, subRoot) || isSubtree(root?.left, subRoot) || isSubtree(root?.right, subRoot)
    }

    fun isSame(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if(root == null && subRoot == null){
            return true
        }

        if(root == null || subRoot == null){
            return false
        }

        return (root?.`val` == subRoot?.`val`) &&
                isSame(root?.left, subRoot?.left) &&
                isSame(root?.right, subRoot?.right)
    }
}