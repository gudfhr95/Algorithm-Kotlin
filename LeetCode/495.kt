class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        var result = 0
        for (i in 1..timeSeries.lastIndex) {
            if (timeSeries[i] < timeSeries[i - 1] + duration) {
                result += timeSeries[i] - timeSeries[i - 1]
            } else {
                result += duration
            }
        }

        result += duration

        return result
    }
}