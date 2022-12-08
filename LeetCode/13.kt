class Solution {

    val map = mapOf(
        "I" to 1,
        "IV" to 4,
        "V" to 5,
        "IX" to 9,
        "X" to 10,
        "XL" to 40,
        "L" to 50,
        "XC" to 90,
        "C" to 100,
        "CD" to 400,
        "D" to 500,
        "CM" to 900,
        "M" to 1000
    )

    fun romanToInt(s: String): Int {
        var result = 0;

        var current = 0;
        while (current < s.lastIndex) {
            val substr = s.substring(current, current + 2);
            if (map.containsKey(substr)) {
                result += map[substr]!!;
                current += 2;
            } else {
                result += map[s.substring(current, current + 1)]!!;
                current += 1;
            }
        }

        if (current == s.lastIndex) {
            result += map[s.substring(current, current + 1)]!!;
        }

        return result;
    }
}