class TwoSum() {

    val numbers = mutableListOf<Int>()

    fun add(number: Int) {
        numbers.add(number)
    }

    fun find(value: Int): Boolean {
        numbers.sort()

        var left = 0
        var right = numbers.lastIndex
        while (left < right) {
            val sum = numbers[left] + numbers[right]
            if (sum == value) {
                return true
            }

            if (sum < value) {
                left += 1
            } else {
                right -= 1
            }
        }

        return false
    }
}