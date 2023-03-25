class Solution {
    fun addStrings(num1: String, num2: String): String {
        var result = ""

        var i = 0
        var j = 0
        var carry = 0
        while (i < num1.length && j < num2.length) {
            val d1 = num1[num1.length - 1 - i] - '0'
            val d2 = num2[num2.length - 1 - j] - '0'

            val sum = d1 + d2 + carry
            result += sum % 10
            carry = sum / 10

            i += 1
            j += 1
        }

        while (i < num1.length) {
            val d1 = num1[num1.length - 1 - i] - '0'

            val sum = d1 + carry
            result += sum % 10
            carry = sum / 10

            i += 1
        }

        while (j < num2.length) {
            val d2 = num2[num2.length - 1 - j] - '0'

            val sum = d2 + carry
            result += sum % 10
            carry = sum / 10

            j += 1
        }

        if (carry != 0) {
            result += carry
        }

        return result.reversed()
    }
}