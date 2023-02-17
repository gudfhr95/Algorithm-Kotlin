class Solution {
    fun missingNumber(nums: IntArray): Int {
        val set = mutableSetOf<Int>()

        for (i in (0..nums.size)) {
            set.add(i)
        }

        for (num in nums) {
            set.remove(num)
        }

        return set.first()
    }
}