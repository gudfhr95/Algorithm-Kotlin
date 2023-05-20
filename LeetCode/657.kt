class Solution {
    fun judgeCircle(moves: String): Boolean {
        var x = 0
        var y = 0

        for(move in moves){
            when(move){
                'U' -> y += 1
                'D' -> y -= 1
                'R' -> x += 1
                'L' -> x -= 1
            }
        }

        return x == 0 && y == 0
    }
}