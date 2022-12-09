class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result = "";

        var minLength = strs.map { it.length }.min()!!;
        for (i in 0 until minLength) {
            val c = strs.first()[i]

            if (!hasSameCharAtIndex(strs, i, c)) {
                break;
            }

            result += c;
        }

        return result;
    }

    fun hasSameCharAtIndex(strs: Array<String>, i: Int, c: Char): Boolean {
        for (str in strs) {
            if (str[i] != c) {
                return false;
            }
        }

        return true;
    }
}