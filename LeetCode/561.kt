class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()

        return nums.filterIndexed { index, e ->
            index % 2 == 0
        }.sum()
    }
}