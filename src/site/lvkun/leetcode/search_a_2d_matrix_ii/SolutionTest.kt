package site.lvkun.leetcode.search_a_2d_matrix_ii

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.Utils

class SolutionTest {
    @Test
    fun testSearchMatrix() {
        val solution = Solution()
        val matrix = Utils.intMatrixFromString("[\n" +
                "  [1,   4,  7, 11, 15],\n" +
                "  [2,   5,  8, 12, 19],\n" +
                "  [3,   6,  9, 16, 22],\n" +
                "  [10, 13, 14, 17, 24],\n" +
                "  [18, 21, 23, 26, 30]\n" +
                "]\n")
        Assert.assertTrue(solution.searchMatrix(matrix, 5))
        Assert.assertFalse(solution.searchMatrix(matrix, 20))
    }
}