package site.lvkun.leetcode.reverse_integer

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testReverse() {
        val solution = Solution()
        var result = solution.reverse(123)
        Assert.assertEquals(321, result)
        result = solution.reverse(-123)
        Assert.assertEquals(-321, result)
        result = solution.reverse(120)
        Assert.assertEquals(21, result)
    }
}