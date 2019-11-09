package site.lvkun.leetcode.ugly_number

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testIsUgly() {
        val solution = Solution()
        Assert.assertTrue(solution.isUgly(6))
        Assert.assertTrue(solution.isUgly(8))
        Assert.assertFalse(solution.isUgly(14))
    }
}