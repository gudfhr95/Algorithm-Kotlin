class Solution {
    fun mySqrt(x: Int): Int {
        var i = Math.pow(2.0, 16.0)
        while (i-- > 0) {
            if (i * i <= x) {
                return i.toInt()
            }
        }

        return 0
    }
}