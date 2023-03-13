class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableListOf<Int>()

        val map = mutableMapOf<Int, Int>()
        for (num in nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1)
        }

        for (num in nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                result.add(num)
                map.put(num, map.getOrDefault(num, 0) - 1)
            }
        }

        return result.toIntArray()
    }
}