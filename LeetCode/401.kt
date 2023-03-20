class Solution {
    fun readBinaryWatch(turnedOn: Int): List<String> {
        val result = mutableListOf<String>()

        for (i in 0 until 1.shl(10)) {
            if (countBits(i) != turnedOn) {
                continue
            }

            val hour = i.shr(6)
            val minute = i and 63

            if (hour >= 12 || minute >= 60) {
                continue
            }

            result.add("${hour}:${minute.toString().padStart(2, '0')}")
        }

        return result
    }

    fun countBits(n: Int): Int {
        var result = 0

        var num = n
        while (num > 0) {
            result += num and 1
            num = num.shr(1)
        }

        return result
    }
}