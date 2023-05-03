class Solution {
    fun distributeCandies(candyType: IntArray): Int {
        val set = mutableSetOf<Int>()

        for(candy in candyType){
            set.add(candy)
        }

        return Math.min(set.size, candyType.size / 2)
    }
}