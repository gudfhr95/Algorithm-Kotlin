class Solution {
    fun detectCapitalUse(word: String): Boolean {
        var isAllCapital = word[0].isUpperCase()
        var isFirstCapital = word[0].isUpperCase()
        var isAllLowerCase = word[0].isLowerCase()

        for(i in 1..word.lastIndex){
            isAllCapital = isAllCapital && word[i].isUpperCase()
            isFirstCapital = isFirstCapital && word[i].isLowerCase()
            isAllLowerCase = isAllLowerCase && word[i].isLowerCase()
        }

        return isAllCapital || isFirstCapital || isAllLowerCase
    }
}