class Solution {
    fun countBits(n: Int): IntArray {
        val result = IntArray(n + 1)

        for (i in 1..n) {
            result[i] = result[i / 2] + (i % 2)
        }

        return result
    }
}