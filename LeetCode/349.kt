class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableSetOf<Int>()

        val set = nums2.toSet()
        for (n in nums1) {
            if (set.contains(n) && !result.contains(n)) {
                result.add(n)
            }
        }

        return result.toIntArray()
    }
}