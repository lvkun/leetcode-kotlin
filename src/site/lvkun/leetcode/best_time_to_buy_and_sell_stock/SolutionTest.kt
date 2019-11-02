package site.lvkun.leetcode.best_time_to_buy_and_sell_stock

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMaxProfit() {
        val solution = Solution()
        Assert.assertEquals(5, solution.maxProfit(intArrayOf(7,1,5,3,6,4)))
        Assert.assertEquals(0, solution.maxProfit(intArrayOf(7,6,4,3,1)))
    }
}