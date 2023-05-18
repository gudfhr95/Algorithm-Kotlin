class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = 0
        for(i in 0 until k){
            sum += nums[i]
        }

        var result = sum.toDouble() / k
        for(i in k..nums.lastIndex){
            sum -= nums[i-k]
            sum += nums[i]

            result = Math.max(result, sum.toDouble() / k)
        }

        return result
    }
}