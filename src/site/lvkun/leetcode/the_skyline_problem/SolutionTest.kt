package site.lvkun.leetcode.the_skyline_problem

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testGetSkyline() {
        val solution = Solution()
        var result = solution.getSkyline(arrayOf(
                intArrayOf(2, 9, 10),
                intArrayOf(3, 7, 15),
                intArrayOf(5, 12, 12),
                intArrayOf(15, 20, 10),
                intArrayOf(19, 24, 8)))
        var expected = listOf(
                listOf(2, 10),
                listOf(3, 15),
                listOf(7, 12),
                listOf(12, 0),
                listOf(15, 10),
                listOf(20, 8),
                listOf(24, 0))
        Assert.assertEquals(expected, result)

        result = solution.getSkyline(arrayOf(
                intArrayOf(0, 2, 3),
                intArrayOf(2, 5, 3)
        ))
        expected = listOf(
                listOf(0, 3),
                listOf(5, 0)
        )
        Assert.assertEquals(expected, result)
    }
}