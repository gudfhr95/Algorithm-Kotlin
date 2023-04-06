class Solution {
    fun licenseKeyFormatting(s: String, k: Int): String {
        val str = s.replace("-", "").toUpperCase()

        val mod = str.length % k

        var result = ""
        if (mod > 0) {
            result = str.substring(0, mod)
        }

        for (i in mod..str.lastIndex step k) {
            if (i > 0) {
                result += "-"
            }
            result += str.substring(i, i + k)
        }

        return result
    }
}