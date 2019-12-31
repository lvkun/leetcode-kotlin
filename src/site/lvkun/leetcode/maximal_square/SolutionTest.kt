package site.lvkun.leetcode.maximal_square

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.Utils

class SolutionTest {
    @Test
    fun testMaximalSquare() {
        val solution = Solution()
        val result = solution.maximalSquare(Utils.charMatrixFromString(
                "1 0 1 0 0\n" +
                "1 0 1 1 1\n" +
                "1 1 1 1 1\n" +
                "1 0 0 1 0", " "))
        Assert.assertEquals(4, result)
    }
}