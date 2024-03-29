class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = mutableMapOf<Char, Char>()
        val set = mutableSetOf<Char>()

        for (i in (0 until s.length)) {
            if (map.containsKey(s[i])) {
                if (map.get(s[i]) != t[i]) {
                    return false
                }
            } else {
                if (set.contains(t[i])) {
                    return false
                }

                map.put(s[i], t[i])
                set.add(t[i])
            }
        }

        return true
    }
}