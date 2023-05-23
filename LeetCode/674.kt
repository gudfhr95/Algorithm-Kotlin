class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        var result = 0

        var cur = 1
        for(i in 1..nums.lastIndex){
            if(nums[i] > nums[i-1]){
                cur += 1
            } else {
                result = Math.max(result, cur)
                cur = 1
            }
        }

        result = Math.max(result, cur)

        return result
    }
}