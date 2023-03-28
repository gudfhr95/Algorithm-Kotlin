class Solution {
    fun arrangeCoins(n: Int): Int {
        var result = 0
        for (i in 1..n) {
            val sum = (i + 1).toLong() * i / 2

            if (sum <= n) {
                result = Math.max(result, i)
            } else {
                break
            }
        }

        return result
    }
}