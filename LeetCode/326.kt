class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        if (n <= 0) {
            return false
        }

        var num = n

        while (num > 1) {
            if (num % 3 != 0) {
                return false
            }

            num /= 3
        }

        return true
    }
}