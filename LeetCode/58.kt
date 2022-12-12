class Solution {
    fun lengthOfLastWord(s: String): Int {
        val splited = s.split(" ")

        for (i in (splited.lastIndex downTo 0)) {
            if (splited[i] != "") {
                return splited[i].length
            }
        }

        return 0
    }
}