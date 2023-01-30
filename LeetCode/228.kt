class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.size == 0) {
            return emptyList()
        }

        val result = mutableListOf<String>()

        var start = nums[0]
        var count = 1
        for (i in (1..nums.lastIndex)) {
            if (nums[i] - nums[i - 1] != 1) {
                if (count == 1) {
                    result.add(start.toString())
                } else {
                    result.add("${start}->${nums[i - 1]}")
                }

                start = nums[i]
                count = 1
            } else {
                count += 1
            }
        }

        if (count == 1) {
            result.add(start.toString())
        } else {
            result.add("${start}->${nums.last()}")
        }

        return result.toList()
    }
}