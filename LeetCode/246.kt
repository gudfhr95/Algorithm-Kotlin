class Solution {
    fun isStrobogrammatic(num: String): Boolean {
        if (num.length == 0) {
            return true
        }

        if (num.length == 1) {
            return when (num[0]) {
                '1', '8', '0' -> true
                else -> false
            }
        }

        return when (num[0]) {
            '1', '8', '0' -> {
                if (num.first() != num.last()) {
                    return false
                }

                return isStrobogrammatic(num.substring(1 until num.lastIndex))
            }

            '6' -> {
                if (num.last() != '9') {
                    return false
                }

                return isStrobogrammatic(num.substring(1 until num.lastIndex))
            }

            '9' -> {
                if (num.last() != '6') {
                    return false
                }

                return isStrobogrammatic(num.substring(1 until num.lastIndex))
            }

            else -> false
        }
    }
}