package site.lvkun.leetcode.insert_interval

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testInsert() {
        val solution = Solution()
        var result = solution.insert(arrayOf(intArrayOf(1, 3), intArrayOf(6, 9)), intArrayOf(2, 5))
        var expected = arrayOf(intArrayOf(1, 5), intArrayOf(6, 9))
        Assert.assertArrayEquals(expected, result)

        result = solution.insert(arrayOf(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(6, 7), intArrayOf(8, 10), intArrayOf(12, 16)), intArrayOf(4, 8))
        expected = arrayOf(intArrayOf(1, 2), intArrayOf(3, 10), intArrayOf(12, 16))
        Assert.assertArrayEquals(expected, result)

        result = solution.insert(arrayOf(), intArrayOf(5, 7))
        expected = arrayOf(intArrayOf(5, 7))
        Assert.assertArrayEquals(expected, result)

        result = solution.insert(arrayOf(intArrayOf(1, 5)), intArrayOf(2, 3))
        expected = arrayOf(intArrayOf(1, 5))
        Assert.assertArrayEquals(expected, result)

        result = solution.insert(arrayOf(intArrayOf(1, 5)), intArrayOf(6, 8))
        expected = arrayOf(intArrayOf(1, 5), intArrayOf(6, 8))
        Assert.assertArrayEquals(expected, result)
    }
}