package site.lvkun.leetcode.best_time_to_buy_and_sell_stock_with_cooldown

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMaxProfit() {
        val solution = Solution()
        Assert.assertEquals(3, solution.maxProfit(intArrayOf(1,2,3,0,2)))
    }
}