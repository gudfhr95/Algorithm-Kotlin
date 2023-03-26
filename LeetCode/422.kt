class Solution {
    fun validWordSquare(words: List<String>): Boolean {
        for ((i, target) in words.withIndex()) {
            var result = ""
            for (word in words) {
                if (i < word.length) {
                    result += word[i]
                }
            }

            if (result != target) {
                return false
            }
        }

        return true
    }
}