class Solution {
    fun validWordAbbreviation(word: String, abbr: String): Boolean {
        if (abbr.length > word.length) {
            return false
        }

        var num = ""

        var wordIndex = 0
        var abbrIndex = 0
        for (c in abbr) {
            if (c.isLetter() || (num == "" && c == '0')) {
                if (num != "") {
                    wordIndex += num.toInt()
                }

                if (wordIndex >= word.length) {
                    break
                }

                num = ""
                if (c != word[wordIndex]) {
                    return false
                }

                wordIndex += 1
            } else {
                num += c
            }

            abbrIndex += 1
        }

        val left = if (num != "") {
            num.toInt()
        } else {
            0
        }

        return wordIndex + left == word.length && abbrIndex == abbr.length
    }
}