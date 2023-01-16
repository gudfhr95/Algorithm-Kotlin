class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n: Int): Int {
        val bits = Integer.toBinaryString(n);

        var result = 0
        for (bit in bits) {
            if (bit == '1') {
                result += 1
            }
        }

        return result
    }
}