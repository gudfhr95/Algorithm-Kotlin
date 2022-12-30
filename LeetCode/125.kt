class Solution {
    fun isPalindrome(s: String): Boolean {
        val removed = s.filter { it.isLetter() || it.isDigit() }.toLowerCase()

        var left = 0
        var right = removed.length - 1
        while (left < right) {
            if (removed[left] != removed[right]) {
                return false
            }

            left += 1
            right -= 1
        }

        return true
    }
}