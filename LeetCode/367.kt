class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var left = 1.toLong()
        var right = num.toLong()

        while (left <= right) {
            val mid = (left + right) / 2

            val square = mid * mid
            if (num.toLong() == square) {
                return true
            }

            if (num.toLong() < square) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return false
    }
}