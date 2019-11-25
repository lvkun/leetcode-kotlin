package site.lvkun.leetcode.merge_intervals

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMerge() {
        val solution = Solution()
        var result = solution.merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
        var expected = arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18))
        Assert.assertArrayEquals(expected, result)

        result = solution.merge(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)))
        expected = arrayOf(intArrayOf(1, 3))
        Assert.assertArrayEquals(expected, result)

        result = solution.merge(arrayOf(intArrayOf(1, 4), intArrayOf(2, 3)))
        expected = arrayOf(intArrayOf(1, 4))
        Assert.assertArrayEquals(expected, result)
    }
}