package site.lvkun.leetcode.two_sum

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testTwoSum() {
        val solution = Solution()
        val result = solution.twoSum(intArrayOf(2, 7, 11, 15), 9)
        Assert.assertArrayEquals(intArrayOf(0, 1), result)
    }
}