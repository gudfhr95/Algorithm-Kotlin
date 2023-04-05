class Solution {
    fun findComplement(num: Int): Int {
        val stack = Stack<Int>()

        var n = num
        while (n > 0) {
            stack.add(n % 2)
            n /= 2
        }

        var result = 0
        while (!stack.isEmpty()) {
            result *= 2
            result += 1 - stack.pop()
        }

        return result
    }
}