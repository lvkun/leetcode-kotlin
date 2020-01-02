package site.lvkun.leetcode.coin_change

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testCoinChange() {
        val solution = Solution()
        Assert.assertEquals(3, solution.coinChange(intArrayOf(1, 2, 5), 11))
        Assert.assertEquals(-1, solution.coinChange(intArrayOf(2), 3))
    }
}