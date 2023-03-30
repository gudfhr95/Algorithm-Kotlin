import java.util.*

class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        val pqG = PriorityQueue<Int>()
        val pqS = PriorityQueue<Int>()

        for (i in g) {
            pqG.offer(i)
        }

        for (i in s) {
            pqS.offer(i)
        }

        var result = 0
        while (!pqG.isEmpty() && !pqS.isEmpty()) {
            if (pqG.peek() <= pqS.poll()) {
                result += 1
                pqG.poll()
            }
        }

        return result
    }
}