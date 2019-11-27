package site.lvkun.leetcode.sort_colors

import org.junit.Assert
import org.junit.Test
import kotlin.math.exp

class SolutionTest {
    @Test
    fun testSortColors() {
        val solution = Solution()
        var result = intArrayOf(2,0,2,1,1,0)
        solution.sortColors(result)
        var expected = intArrayOf(0,0,1,1,2,2)
        Assert.assertArrayEquals(expected, result)

        result = intArrayOf(2,0,1)
        solution.sortColors(result)
        expected = intArrayOf(0,1,2)
        Assert.assertArrayEquals(expected, result)

        result = intArrayOf(1,2,0)
        solution.sortColors(result)
        expected = intArrayOf(0,1,2)
        Assert.assertArrayEquals(expected, result)
    }
}