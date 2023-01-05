class Solution {
    fun convertToTitle(columnNumber: Int): String {
        var result = ""

        var cur = columnNumber - 1
        while (true) {
            val mod = cur % 26
            result += 'A' + mod

            cur /= 26
            if (cur == 0) {
                break;
            }

            cur -= 1
        }

        return result.reversed()
    }
}