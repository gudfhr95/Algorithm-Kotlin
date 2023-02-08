class Solution {
    fun canAttendMeetings(intervals: Array<IntArray>): Boolean {
        if (intervals.size == 0) {
            return true
        }

        intervals.sortWith(compareBy({ it[0] }, { it[1] }))

        var start = intervals[0][0]
        var end = intervals[0][1]
        for (i in (1..intervals.lastIndex)) {
            if (end > intervals[i][0]) {
                return false
            }

            start = intervals[i][0]
            end = intervals[i][1]
        }

        return true
    }
}