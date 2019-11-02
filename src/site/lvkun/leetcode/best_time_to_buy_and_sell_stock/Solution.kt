package site.lvkun.leetcode.best_time_to_buy_and_sell_stock

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var result = 0

        var low = Integer.MAX_VALUE
        for (price in prices) {
            if (price < low) {
                low = price
            }

            result = maxOf(price - low, result)
        }

        return result
    }
}