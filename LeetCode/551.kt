class Solution {
    fun checkRecord(s: String): Boolean {
        var absent = 0
        var late = 0
        var before = 'P'

        for(c in s){
            if(c == 'A'){
                absent += 1
            } else if(c == 'L'){
                if(before == 'L'){
                    late += 1
                } else {
                    late = 1
                }
            }

            if(absent >= 2){
                return false
            }

            if(late >= 3){
                return false
            }

            before = c
        }

        return true
    }
}