class Solution {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var candidate = Int.MIN_VALUE

        for (num in nums) {
            if (count == 0) {
                candidate = num
            }

            if (num == candidate) {
                count += 1
            } else {
                count -= 1
            }
        }

        return candidate
    }
}