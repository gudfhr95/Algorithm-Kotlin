class Solution {
    fun findMissingRanges(nums: IntArray, lower: Int, upper: Int): List<String> {
        if (nums.size == 0) {
            if (lower == upper) {
                return listOf("${lower}")
            } else {
                return listOf("${lower}->${upper}")
            }
        }

        val result = mutableListOf<String>()
        var cur = lower
        for (num in nums) {
            if (cur == num) {
                cur = num + 1
            } else if (num - cur == 1) {
                result.add("${cur}")
                cur = num + 1
            } else {
                result.add("${cur}->${num - 1}")
                cur = num + 1
            }
        }

        if (cur <= upper) {
            if (upper == cur) {
                result.add("${cur}")
            } else {
                result.add("${cur}->${upper}")
            }
        }

        return result.toList()
    }
}