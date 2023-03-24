class Solution {
    fun longestPalindrome(s: String): Int {
        val map = mutableMapOf<Char, Int>()

        for (c in s) {
            val n = map.getOrDefault(c, 0) + 1

            map.put(c, n)
        }

        var result = 0
        var one = 0

        map.forEach {
            if (it.value % 2 == 0) {
                result += it.value
            } else {
                result += it.value - 1
                one = 1
            }
        }

        return result + one
    }
}