class Solution {
    fun reverseString(s: CharArray): Unit {
        var left = 0
        var right = s.lastIndex

        while (left < right) {
            val temp = s[left]
            s[left] = s[right]
            s[right] = temp

            left++
            right--
        }
    }
}