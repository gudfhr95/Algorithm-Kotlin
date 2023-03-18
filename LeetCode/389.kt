class Solution {
    fun findTheDifference(s: String, t: String): Char {
        val arr = IntArray(26)

        for (c in s) {
            arr[c - 'a'] += 1
        }

        for (c in t) {
            arr[c - 'a'] -= 1
        }

        for (i in arr.indices) {
            if (arr[i] != 0) {
                return 'a' + i
            }
        }

        return 'a'
    }
}