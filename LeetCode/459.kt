class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        for (i in 1..s.length - 1) {
            if (s.length % i != 0) {
                continue
            }

            val substr = s.substring(0, i)
            var index = i
            var isSame = true
            while (index < s.length) {
                val temp = s.substring(index, index + i)

                if (temp != substr) {
                    isSame = false
                    break
                }

                index += i
            }

            if (isSame) {
                return true
            }
        }

        return false
    }
}