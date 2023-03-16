class Solution : GuessGame() {
    override fun guessNumber(n: Int): Int {
        var left = 1
        var right = n

        while (left <= right) {
            val mid = ((left.toLong() + right.toLong()) / 2).toInt()

            val g = guess(mid)
            if (g == 0) {
                return mid
            }

            if (g == 1) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return 0
    }
}