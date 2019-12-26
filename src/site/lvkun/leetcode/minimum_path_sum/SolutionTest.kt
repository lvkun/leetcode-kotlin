package site.lvkun.leetcode.minimum_path_sum

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.Utils

class SolutionTest {
    @Test
    fun testMinPathSum() {
        val solution = Solution()
        val grid = Utils.intMatrixFromString("[\n" +
                "  [1,3,1],\n" +
                "  [1,5,1],\n" +
                "  [4,2,1]\n" +
                "]")
        Assert.assertEquals(7, solution.minPathSum(grid))
    }
}