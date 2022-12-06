class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in 0..nums.lastIndex){
            for(j in (i+1)..nums.lastIndex){
                if(nums[i] + nums[j] == target){
                    return intArrayOf(i, j)
                }
            }
        }

        return intArrayOf();
    }
}