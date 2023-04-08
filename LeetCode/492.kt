import kotlin.math.*

class Solution {
    fun constructRectangle(area: Int): IntArray {
        var minDiff = Int.MAX_VALUE
        var result = intArrayOf()
        for (i in 1..area) {
            if (area % i == 0) {
                val diff = abs(i - (area / i))

                if (diff <= minDiff) {
                    minDiff = diff
                    result = intArrayOf(i, area / i)
                }
            }
        }

        result.sortDescending()

        return result
    }
}