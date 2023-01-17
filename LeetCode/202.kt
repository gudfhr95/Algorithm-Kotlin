class Solution {
    fun isHappy(n: Int): Boolean {
        val set = mutableSetOf<Int>()

        var num = n

        while (!set.contains(num)) {
            if (num == 1) {
                return true
            }

            set.add(num)
            num = squareOfDigits(num)
        }

        return false
    }

    fun squareOfDigits(n: Int): Int {
        var result = 0

        var num = n
        while (num > 0) {
            val mod = num % 10
            result += mod * mod

            num /= 10
        }

        return result
    }
}