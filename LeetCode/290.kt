class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val map = mutableMapOf<Char, String>()
        val inverseMap = mutableMapOf<String, Char>()

        val words = s.split(" ")
        if (words.size != pattern.length) {
            return false
        }

        for ((i, p) in pattern.withIndex()) {
            val word = words[i]

            if (map.containsKey(p)) {
                if (map[p] != word) {
                    return false
                }
            } else {
                if (inverseMap.containsKey(word)) {
                    return false
                }

                map[p] = word
                inverseMap[word] = p
            }
        }

        return true
    }
}