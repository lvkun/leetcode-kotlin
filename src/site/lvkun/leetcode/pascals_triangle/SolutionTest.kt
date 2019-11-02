package site.lvkun.leetcode.pascals_triangle

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testGenerate() {
        val solution = Solution()
        val result = solution.generate(5)
        val expected = listOf(
                listOf(1),
                listOf(1, 1),
                listOf(1, 2, 1),
                listOf(1, 3, 3, 1),
                listOf(1, 4, 6, 4, 1))
        Assert.assertEquals(expected, result)
    }
}