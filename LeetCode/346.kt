class MovingAverage(size: Int) {

    val size = size

    val q = ArrayDeque<Int>()
    var sum = 0

    fun next(`val`: Int): Double {
        if (q.size == size) {
            sum -= q.remove()
        }

        q.add(`val`)
        sum += `val`

        return sum.toDouble() / q.size
    }

}
