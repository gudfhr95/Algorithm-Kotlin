class Solution {
    fun maxProfit(prices: IntArray): Int {
        var result = 0

        var min = Integer.MAX_VALUE
        var max = Integer.MAX_VALUE
        for (price in prices) {
            if (price < min) {
                result = Math.max(result, max - min)

                min = price
                max = price
            } else if (price > max) {
                max = Math.max(max, price)
            }
        }

        result = Math.max(result, max - min)

        return result
    }
}