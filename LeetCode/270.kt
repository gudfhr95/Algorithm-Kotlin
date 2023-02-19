class Solution {
    fun closestValue(root: TreeNode?, target: Double): Int {
        var result = root!!.`val`

        if (root.left != null) {
            val cv = closestValue(root.left, target)

            if (Math.abs(cv - target) < Math.abs(result - target)) {
                result = cv
            }
        }

        if (root.right != null) {
            val cv = closestValue(root.right, target)

            if (Math.abs(cv - target) < Math.abs(result - target)) {
                result = cv
            }
        }

        return result
    }
}