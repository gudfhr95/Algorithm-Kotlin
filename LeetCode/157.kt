class Solution : Reader4() {
    override fun read(buf: CharArray, n: Int): Int {
        var copiedChars = 0
        var readChars = 4
        var buf4 = CharArray(4)

        while (copiedChars < n && readChars == 4) {
            readChars = read4(buf4)

            for (i in 0 until readChars) {
                if (copiedChars == n) {
                    return copiedChars
                }

                buf[copiedChars] = buf4[i]
                copiedChars += 1
            }
        }

        return copiedChars
    }
}