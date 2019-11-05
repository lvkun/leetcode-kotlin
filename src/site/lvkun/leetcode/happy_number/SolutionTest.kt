package site.lvkun.leetcode.happy_number

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testIsHappy() {
        val solution = Solution()
//        Assert.assertTrue(solution.isHappy(19))
        Assert.assertFalse(solution.isHappy(3))
    }
}