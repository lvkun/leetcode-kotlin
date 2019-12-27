package site.lvkun.leetcode.unique_binary_search_trees

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testNumTrees() {
        val solution = Solution()
        Assert.assertEquals(5, solution.numTrees(3))
    }
}