class Solution {
    fun generatePossibleNextMoves(currentState: String): List<String> {
        val result = mutableListOf<String>()

        if (currentState.length <= 1) {
            return result
        }

        for (i in 1..currentState.lastIndex) {
            if (currentState[i] == currentState[i - 1]) {
                val nextState = currentState.toCharArray()

                if (currentState[i] == '+') {
                    nextState[i] = '-'
                    nextState[i - 1] = '-'
                    result.add(String(nextState))
                }
            }
        }

        return result
    }
}