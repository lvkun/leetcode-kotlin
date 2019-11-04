package site.lvkun.leetcode.factorial_trailing_zeroes

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testTrailingZeroes() {
        val solution = Solution()
        Assert.assertEquals(0, solution.trailingZeroes(3))
        Assert.assertEquals(1, solution.trailingZeroes(5))
    }
}