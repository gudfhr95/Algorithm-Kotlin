class Solution {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        val result = mutableListOf<String>()

        var min = Int.MAX_VALUE
        for(i in 0..list1.lastIndex){
            for(j in 0..list2.lastIndex){
                if(list1[i] == list2[j]){
                    if(i + j > min) {
                        continue
                    }

                    if(i + j < min){
                        result.clear()
                        min = i + j
                    }

                    result.add(list1[i])
                }
            }
        }

        return result.toTypedArray()
    }
}