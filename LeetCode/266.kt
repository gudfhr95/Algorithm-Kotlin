class Solution {
    fun canPermutePalindrome(s: String): Boolean {
        val arr = IntArray(26)

        for (c in s) {
            arr[c - 'a'] += 1
        }

        var count = 0
        for (i in (0..arr.lastIndex)) {
            count += arr[i] % 2
        }

        return count <= 1
    }
}