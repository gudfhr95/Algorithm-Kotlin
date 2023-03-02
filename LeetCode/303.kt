class NumArray(val nums: IntArray) {

    fun sumRange(left: Int, right: Int): Int {
        var result = 0

        for (i in left..right) {
            result += nums[i]
        }

        return result
    }
}