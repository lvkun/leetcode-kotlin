package site.lvkun.leetcode.pascals_triangle_ii

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testGetRow() {
        val solution = Solution()
        Assert.assertEquals(listOf(1, 3, 3, 1), solution.getRow(3))
    }
}