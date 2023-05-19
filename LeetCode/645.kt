class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        val appeared = IntArray(nums.size + 1)

        for(num in nums){
            appeared[num] += 1
        }

        val result = IntArray(2)
        for(i in 1..appeared.lastIndex){
            if(appeared[i] == 0){
                result[1] = i
            } else if(appeared[i] == 2){
                result[0] = i
            }
        }

        return result
    }
}