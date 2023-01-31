class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        var i = n
        while (i > 1) {
            if (i % 2 == 1) {
                return false
            }

            i = i / 2
        }

        return i > 0
    }
}