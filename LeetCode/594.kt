class Solution {
    fun findLHS(nums: IntArray): Int {
        val map = TreeMap<Int, Int>()

        for(num in nums){
            map.put(num, map.getOrDefault(num, 0) + 1)
        }

        val list = map.toList()
        var result = 0
        for(i in 1..list.lastIndex){
            if(Math.abs(list[i].first - list[i-1].first) > 1){
                continue
            }

            result = Math.max(result, list[i].second + list[i-1].second)
        }

        return result
    }
}