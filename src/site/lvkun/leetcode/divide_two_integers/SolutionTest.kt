package site.lvkun.leetcode.divide_two_integers

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testDivide() {
        val solution = Solution()
        Assert.assertEquals(-1073741824, solution.divide(-2147483648, 2))
        Assert.assertEquals(3, solution.divide(10, 3))
        Assert.assertEquals(-2, solution.divide(7, -3))
    }
}