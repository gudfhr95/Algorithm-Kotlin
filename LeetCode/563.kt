class Solution {
    fun findTilt(root: TreeNode?): Int {
        if(root == null){
            return 0
        }

        var tilt = findTilt(root.left) + findTilt(root.right)
        val left = root.left?.`val` ?: 0
        val right = root.right?.`val` ?: 0

        root.`val` += left + right

        tilt += Math.abs(left - right)

        return tilt
    }
}