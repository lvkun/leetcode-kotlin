package site.lvkun.leetcode.maximal_rectangle

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.Utils

class SolutionTest {
    @Test
    fun testMaximalRectangle() {
        val matrix = Utils.matrixFromString("[\n" +
                "  [\"1\",\"0\",\"1\",\"0\",\"0\"],\n" +
                "  [\"1\",\"0\",\"1\",\"1\",\"1\"],\n" +
                "  [\"1\",\"1\",\"1\",\"1\",\"1\"],\n" +
                "  [\"1\",\"0\",\"0\",\"1\",\"0\"]\n" +
                "]")
        val solution = Solution()
        Assert.assertEquals(6, solution.maximalRectangle(matrix))
    }
}