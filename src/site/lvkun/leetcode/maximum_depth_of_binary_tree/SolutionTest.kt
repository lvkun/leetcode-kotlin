package site.lvkun.leetcode.maximum_depth_of_binary_tree

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testMaxDepth() {
        val solution = Solution()
        val tree = TreeNode(3,
                TreeNode(9),
                TreeNode(20, TreeNode(15), TreeNode(7)))
        Assert.assertEquals(3, solution.maxDepth(tree))
    }
}