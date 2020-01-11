package site.lvkun.leetcode.average_of_levels_in_binary_tree

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testAverageOfLevels() {
        val solution = Solution()
        val result = solution.averageOfLevels(TreeNode(3,
                TreeNode(9),
                TreeNode(20,
                        TreeNode(15),
                        TreeNode(7))))
        Assert.assertArrayEquals(doubleArrayOf(3.0, 14.5, 11.0), result, 0.01)
    }
}