package site.lvkun.leetcode.move_zeroes

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMoveZeroes() {
        val solution = Solution()
        val result = intArrayOf(0,1,0,3,12)
        solution.moveZeroes(result)
        val expected = intArrayOf(1,3,12,0,0)
        Assert.assertArrayEquals(expected, result)
    }
}