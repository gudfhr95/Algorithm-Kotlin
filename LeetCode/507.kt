class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        var result = 0
        for(i in 1 until num){
            if(num % i == 0){
                result += i
            }
        }

        return result == num
    }
}