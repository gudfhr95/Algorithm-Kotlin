class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n: Int): Int {
        val binaryString = Integer.toBinaryString(n).padStart(Int.SIZE_BITS, '0')

        return binaryString.reversed().toLong(2).toInt()
    }
}