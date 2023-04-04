class Solution {

    val dx = intArrayOf(0, 1, 0, -1)
    val dy = intArrayOf(-1, 0, 1, 0)

    fun islandPerimeter(grid: Array<IntArray>): Int {
        val q = ArrayDeque<Pair<Int, Int>>()
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }

        val start = getStart(grid)
        println(start)
        q.add(start)
        visited[start.second][start.first] = true

        var result = 0
        while (!q.isEmpty()) {
            val cur = q.remove()

            for (k in 0 until 4) {
                val next = Pair(cur.first + dx[k], cur.second + dy[k])

                if (next.second < 0 || next.second >= grid.size || next.first < 0 || next.first >= grid[next.second].size) {
                    result += 1
                    continue
                }

                if (visited[next.second][next.first]) {
                    continue
                }

                if (grid[next.second][next.first] == 0) {
                    result += 1
                    continue
                }

                q.add(next)
                visited[next.second][next.first] = true
            }
        }

        return result
    }

    fun getStart(grid: Array<IntArray>): Pair<Int, Int> {
        for (y in 0 until grid.size) {
            for (x in 0 until grid[y].size) {
                if (grid[y][x] == 1) {
                    return Pair(x, y)
                }
            }
        }

        return Pair(-1, -1)
    }
}