class Solution : VersionControl() {
    override fun firstBadVersion(n: Int): Int {
        var left = 1
        var right = n

        while (left < right) {
            val mid = ((left.toLong() + right.toLong()) / 2).toInt()

            if (isBadVersion(mid)) {
                right = mid
            } else {
                left = mid + 1
            }
        }

        return left
    }
}