class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        if (rowIndex == 0) {
            return listOf(1)
        } else if (rowIndex == 1) {
            return listOf(1, 1)
        }

        val result = mutableListOf(1)
        val prevRow = getRow(rowIndex - 1)
        for (i in 1 until prevRow.size) {
            result.add(prevRow[i - 1] + prevRow[i])
        }
        result.add(1)

        return result.toList()
    }
}