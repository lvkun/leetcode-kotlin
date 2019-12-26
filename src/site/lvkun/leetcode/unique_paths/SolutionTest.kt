package site.lvkun.leetcode.unique_paths

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testUniquePaths() {
        val solution = Solution()
        Assert.assertEquals(3, solution.uniquePaths(3, 2))
        Assert.assertEquals(28, solution.uniquePaths(7, 3))
    }
}