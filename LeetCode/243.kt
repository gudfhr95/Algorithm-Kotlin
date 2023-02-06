class Solution {
    fun shortestDistance(wordsDict: Array<String>, word1: String, word2: String): Int {
        var result = Int.MAX_VALUE

        var word1Index = -1
        var word2Index = -1

        for (i in (0..wordsDict.lastIndex)) {
            if (wordsDict[i] == word1) {
                if (word2Index != -1) {
                    result = Math.min(result, Math.abs(i - word2Index))
                }

                word1Index = i
            } else if (wordsDict[i] == word2) {
                if (word1Index != -1) {
                    result = Math.min(result, Math.abs(word1Index - i))
                }

                word2Index = i
            }
        }

        return Math.min(result, Math.abs(word1Index - word2Index))
    }
}