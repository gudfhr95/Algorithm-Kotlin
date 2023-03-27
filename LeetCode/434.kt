class Solution {
    fun countSegments(s: String): Int {
        val splited = s.split(" ")

        var result = 0
        for (split in splited) {
            if (split.trim() != "") {
                result += 1
            }
        }

        return result
    }
}