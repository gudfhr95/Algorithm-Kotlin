class Solution {
    fun addBinary(a: String, b: String): String {
        var result = ""

        var binaryA = ""
        var binaryB = ""
        if (a.length > b.length) {
            binaryA = a
            binaryB = b
        } else {
            binaryA = b
            binaryB = a
        }

        binaryA = binaryA.reversed()
        binaryB = binaryB.reversed()

        var index = 0
        var carry = 0
        while (index < binaryB.length) {
            val bitA = binaryA[index] - '0'
            val bitB = binaryB[index] - '0'

            var sum = bitA + bitB + carry
            if (sum >= 2) {
                sum -= 2
                carry = 1
            } else {
                carry = 0
            }

            result += sum
            index += 1
        }

        while (index < binaryA.length) {
            val bitA = binaryA[index] - '0'

            var sum = bitA + carry
            if (sum >= 2) {
                sum -= 2
                carry = 1
            } else {
                carry = 0
            }

            result += sum
            index += 1
        }

        if (carry == 1) {
            result += carry
        }

        return result.reversed()
    }
}