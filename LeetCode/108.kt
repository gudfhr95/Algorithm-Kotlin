class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        if (nums.size == 0) {
            return null
        }

        val midIndex = nums.lastIndex / 2
        val treeNode = TreeNode(nums[midIndex])
        treeNode.left = sortedArrayToBST(nums.slice(0 until midIndex).toIntArray())
        treeNode.right = sortedArrayToBST(nums.slice(midIndex + 1..nums.lastIndex).toIntArray())

        return treeNode
    }
}