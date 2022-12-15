class Solution {

    val d = IntArray(46) { -1 }

    fun climbStairs(n: Int): Int {
        if (n <= 1) {
            return 1
        }

        if (d[n] != -1) {
            return d[n]
        }

        d[n] = climbStairs(n - 1) + climbStairs(n - 2)
        return d[n]
    }
}