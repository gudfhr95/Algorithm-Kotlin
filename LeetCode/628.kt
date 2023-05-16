class Solution {
    fun maximumProduct(nums: IntArray): Int {
        val sorted = nums.sorted()
        val c1 = sorted[sorted.lastIndex] * sorted[sorted.lastIndex - 1] * sorted[sorted.lastIndex - 2]
        val c2 = sorted[sorted.lastIndex] * sorted[0] * sorted[1]

        return Math.max(c1, c2)
    }
}