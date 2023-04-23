class Solution {
    fun reverseStr(s: String, k: Int): String {
        var result = ""

        var temp = ""
        var reverse = true
        for(i in 0..s.lastIndex){
            temp += s[i]

            if(temp.length == k){
                if(reverse){
                    result += temp.reversed()
                    reverse = false
                } else {
                    result += temp
                    reverse = true
                }

                temp = ""
            }
        }


        if(reverse){
            result += temp.reversed()
        } else {
            result += temp
        }

        return result
    }
}