package site.lvkun.leetcode.power_of_two

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testIsPowerOfTwo() {
        val solution = Solution()
        Assert.assertTrue(solution.isPowerOfTwo(1))
        Assert.assertTrue(solution.isPowerOfTwo(16))
        Assert.assertFalse(solution.isPowerOfTwo(218))
    }
}