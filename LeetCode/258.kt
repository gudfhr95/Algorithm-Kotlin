class Solution {
    fun addDigits(num: Int): Int {
        if (num / 10 == 0) {
            return num
        }

        var n = num
        var result = 0
        while (n > 0) {
            result += n % 10
            n /= 10
        }

        return addDigits(result)
    }
}