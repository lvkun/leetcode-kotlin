package site.lvkun.leetcode.target_sum

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testFindTargetSumWays() {
        val solution = Solution()
        Assert.assertEquals(5, solution.findTargetSumWays(intArrayOf(1, 1, 1, 1, 1), 3))
    }
}