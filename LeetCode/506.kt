class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val map = TreeMap<Int, Int>(reverseOrder())

        for((i, s) in score.withIndex()){
            map.put(s, i)
        }

        println(map)

        val result = Array(score.size) { i -> "" }
        var rank = 1

        for((key, value) in map){
            if(rank == 1){
                result[value] = "Gold Medal"
            } else if(rank == 2){
                result[value] = "Silver Medal"
            } else if(rank == 3){
                result[value] = "Bronze Medal"
            } else {
                result[value] = rank.toString()
            }

            rank += 1
        }

        return result
    }
}