package site.lvkun.leetcode.plus_one

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testPlusOne() {
        val solution = Solution()
        var result = solution.plusOne(intArrayOf(1,2,3))
        Assert.assertArrayEquals(intArrayOf(1,2,4), result)

        result = solution.plusOne(intArrayOf(4,3,2,1))
        Assert.assertArrayEquals(intArrayOf(4,3,2,2), result)

        result = solution.plusOne(intArrayOf(9,9,9))
        Assert.assertArrayEquals(intArrayOf(1,0,0,0), result)
    }
}