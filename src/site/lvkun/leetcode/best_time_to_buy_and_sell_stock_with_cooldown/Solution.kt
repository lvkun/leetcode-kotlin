package site.lvkun.leetcode.best_time_to_buy_and_sell_stock_with_cooldown

/** TODO: Redo */
class Solution {
    fun maxProfit(prices: IntArray): Int {
        var sold = 0
        var rest = 0
        var hold = Int.MIN_VALUE;
        for (p in prices) {
            val pre_sold = sold
            sold = hold + p
            hold = maxOf(hold, rest - p)
            rest = maxOf(rest, pre_sold)
        }

        return maxOf(sold, rest)
    }
}