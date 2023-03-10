class Solution {
    fun strStr(haystack: String, needle: String): Int {
        for (i in 0..haystack.lastIndex - needle.length + 1) {
            var matches = true
            for (j in 0..needle.lastIndex) {
                if (haystack[i + j] != needle[j]) {
                    matches = false
                    break;
                }
            }

            if (matches) {
                return i
            }
        }

        return -1
    }
}