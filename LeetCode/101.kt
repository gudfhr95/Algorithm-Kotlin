class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }

        if (root?.left?.`val` != root?.right?.`val`) {
            return false
        }

        return isSymmetricRec(root?.left, root?.right)
    }

    fun isSymmetricRec(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) {
            return true
        }

        return left?.`val` == right?.`val` &&
                isSymmetricRec(left?.left, right?.right) &&
                isSymmetricRec(left?.right, right?.left)
    }
}