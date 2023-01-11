class Solution {
    fun titleToNumber(columnTitle: String): Int {
        var result = 0
        for (c in columnTitle) {
            result *= 26
            result += (c - 'A' + 1)
        }

        return result
    }
}