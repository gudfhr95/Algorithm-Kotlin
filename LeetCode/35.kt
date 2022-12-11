class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size

        while (left < right) {
            val mid = (left + right) / 2

            if (nums[mid] == target) {
                return mid
            }

            if (nums[mid] > target) {
                right = mid
            } else {
                left = mid + 1;
            }
        }

        return left
    }
}