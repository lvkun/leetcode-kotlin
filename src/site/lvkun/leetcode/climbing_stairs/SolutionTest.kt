package site.lvkun.leetcode.climbing_stairs

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testClimbStairs() {
        val solution = Solution()
        Assert.assertEquals(2, solution.climbStairs(2))
        Assert.assertEquals(3, solution.climbStairs(3))
        Assert.assertEquals(1836311903, solution.climbStairs(45))
    }
}