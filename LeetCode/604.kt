class StringIterator(val compressedString: String) {

    var currentChar = compressedString[0]
    var count = 0
    var index = 0

    fun next(): Char {

        if(count > 0){
            count -= 1

            return currentChar
        }

        if(index >= compressedString.length){
            return ' '
        }

        if(compressedString[index].isLetter()){
            currentChar = compressedString[index++]

            var temp = ""
            while(index < compressedString.length && compressedString[index].isDigit()) {
                temp += compressedString[index++]
            }
            count = temp.toInt() - 1

            return currentChar
        }

        return ' '
    }

    fun hasNext(): Boolean {
        if(count > 0){
            return true
        }

        return index < compressedString.length
    }
}