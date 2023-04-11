class Solution {

    val map = mutableMapOf<Char, Int>()

    fun findWords(words: Array<String>): Array<String> {
        for(c in "qwertyuiop"){
            map.put(c, 0)
        }

        for(c in "asdfghjkl"){
            map.put(c, 1)
        }

        for(c in "zxcvbnm"){
            map.put(c, 2)
        }

        val result = mutableListOf<String>()
        for(word in words){
            if(canType(word.toLowerCase())){
                result.add(word)
            }
        }

        return result.toTypedArray()
    }

    fun canType(word: String): Boolean {
        val first = map.getOrDefault(word[0], -1)

        for(i in 1..word.lastIndex){
            if(map.getOrDefault(word[i], -1) != first){
                return false
            }
        }

        return true
    }
}