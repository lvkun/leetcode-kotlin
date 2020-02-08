package site.lvkun.leetcode.range_sum_query_2d_immutable

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.Utils

class SolutionTest {
    @Test
    fun testSumRegion() {
        val matrix = NumMatrix(Utils.intMatrixFromString("[\n" +
                "  [3, 0, 1, 4, 2],\n" +
                "  [5, 6, 3, 2, 1],\n" +
                "  [1, 2, 0, 1, 5],\n" +
                "  [4, 1, 0, 1, 7],\n" +
                "  [1, 0, 3, 0, 5]\n" +
                "]"))

        Assert.assertEquals(8, matrix.sumRegion(2, 1, 4, 3))
        Assert.assertEquals(11, matrix.sumRegion(1, 1, 2, 2))
        Assert.assertEquals(12, matrix.sumRegion(1, 2, 2, 4))
    }


}