class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val result = IntArray(nums1.size) { i -> -1 }

        for (i in 0..nums1.lastIndex) {
            var index = -1
            for (j in 0..nums2.lastIndex) {
                if (nums1[i] == nums2[j]) {
                    index = j
                }
            }

            for (j in index + 1..nums2.lastIndex) {
                if (nums1[i] < nums2[j]) {
                    result[i] = nums2[j]
                    break
                }
            }
        }

        return result
    }
}