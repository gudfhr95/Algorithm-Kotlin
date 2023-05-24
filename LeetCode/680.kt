class Solution {
    fun validPalindrome(s: String): Boolean {
        return isValidPalindrome(s, 0)
    }

    fun isValidPalindrome(s: String, count: Int): Boolean {
        var start = 0
        var end = s.lastIndex
        var c = count

        while(start < end){
            if(s[start] != s[end]) {
                if(c == 1){
                    return false
                }

                c += 1
                return isValidPalindrome(s.substring(start + 1, end+1), c) || isValidPalindrome(s.substring(start, end), c)
            }

            start += 1
            end -= 1
        }

        return true
    }
}