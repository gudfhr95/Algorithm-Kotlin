class Solution {
    fun isPalindrome(x: Int): Boolean {
        return isPalindrome(x.toString())
    }

    fun isPalindrome(x: String): Boolean {
        if(x.length <= 1){
            return true
        }

        if(x.first() != x.last()){
            return false;
        }

        return isPalindrome(x.substring(1 until x.lastIndex))
    }
}