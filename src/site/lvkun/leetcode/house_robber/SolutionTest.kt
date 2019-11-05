package site.lvkun.leetcode.house_robber

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testRob() {
        val solution = Solution()
        Assert.assertEquals(4, solution.rob(intArrayOf(1,2,3,1)))
        Assert.assertEquals(12, solution.rob(intArrayOf(2,7,9,3,1)))
    }
}