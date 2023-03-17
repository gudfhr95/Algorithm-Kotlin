class Solution {
    fun firstUniqChar(s: String): Int {
        val map = LinkedHashMap<Char, MutableList<Int>>()

        for ((i, c) in s.withIndex()) {
            val list = map.getOrDefault(c, mutableListOf<Int>())

            list.add(i)
            map.put(c, list)
        }

        for (entry in map.entries.iterator()) {
            if (entry.value.size == 1) {
                return entry.value.first()
            }
        }

        return -1
    }
}