package site.lvkun.leetcode.add_digits

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testAddDigits() {
        val solution = Solution()

        Assert.assertEquals(2, solution.addDigits(38))
    }
}