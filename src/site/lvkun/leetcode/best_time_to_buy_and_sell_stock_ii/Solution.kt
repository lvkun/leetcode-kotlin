package site.lvkun.leetcode.best_time_to_buy_and_sell_stock_ii

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0

        for (pair in prices.toList().zipWithNext()) {
            val p = pair.second - pair.first
            if (p > 0) {
                profit += p
            }
        }

        return profit
    }
}