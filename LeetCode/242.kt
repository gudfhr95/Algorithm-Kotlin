class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val map = mutableMapOf<Char, Int>()

        for (c in s) {
            if (map[c] == null) {
                map[c] = 0
            }

            map[c]?.let { map[c] = it + 1 }
        }

        for (c in t) {
            if (map[c] == null) {
                return false
            }

            map[c]?.let { map[c] = it - 1 }
            if (map[c] == 0) {
                map.remove(c)
            }
        }

        return map.isEmpty()
    }
}