class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        val size = mat.size * mat[0].size

        if(r * c != size){
            return mat
        }

        var cur = 0
        var result = Array(r) { IntArray(c) }
        while(cur < size){
            val matX = cur % mat[0].size
            val matY = cur / mat[0].size
            val x = cur % c
            val y = cur / c

            result[y][x] = mat[matY][matX]

            cur += 1
        }

        return result
    }
}