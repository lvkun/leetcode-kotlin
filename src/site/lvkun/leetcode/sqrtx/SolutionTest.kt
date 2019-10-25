package site.lvkun.leetcode.sqrtx

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMySqrt() {
        val solution = Solution()
        Assert.assertEquals(2, solution.mySqrt(4))
        Assert.assertEquals(2, solution.mySqrt(8))
        Assert.assertEquals(1, solution.mySqrt(1))
    }
}