class Solution {
    fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int {
        val result = m * n

        if(ops.size == 0){
            return result
        }

        val maxX = ops.sortedWith(compareBy({it[0]}, {it[1]})).first()[0]

        val maxY = ops.sortedWith(compareBy({it[1]}, {it[0]})).first()[1]

        if(maxX == 0 && maxY == 0){
            return result
        } else {
            return maxX * maxY
        }
    }
}