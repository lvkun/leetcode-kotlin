package site.lvkun.leetcode.perfect_squares

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testNumSquares() {
        val solution = Solution()
        Assert.assertEquals(3, solution.numSquares(12))
        Assert.assertEquals(2, solution.numSquares(13))
    }
}