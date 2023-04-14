import kotlin.math.*

class Solution {
    fun convertToBase7(num: Int): String {
        if(num == 0){
            return "0"
        }

        var result = ""
        var n = abs(num)
        while(n > 0){
            result += n % 7
            n /= 7
        }

        val isNegative: Boolean = num < 0
        if(isNegative){
            result += '-'
        }

        return result.reversed()
    }
}