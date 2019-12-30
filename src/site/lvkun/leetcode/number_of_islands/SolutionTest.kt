package site.lvkun.leetcode.number_of_islands

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.Utils

class SolutionTest {
    @Test
    fun testNumIslands() {
        val solution = Solution()
        var grid = Utils.charMatrixFromString("11110\n" +
                "11010\n" +
                "11000\n" +
                "00000", "")
        Assert.assertEquals(1, solution.numIslands(grid))

        grid = Utils.charMatrixFromString("11000\n" +
                "11000\n" +
                "00100\n" +
                "00011", "")
        Assert.assertEquals(3, solution.numIslands(grid))
    }
}