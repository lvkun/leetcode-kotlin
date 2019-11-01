package site.lvkun.leetcode.binary_tree_level_order_traversal_ii

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testLevelOrderBottom() {
        val solution = Solution()
        val tree = TreeNode(3,
                TreeNode(9),
                TreeNode(20,
                        TreeNode(15),
                        TreeNode(7)))
        val expected = listOf(listOf(15, 7), listOf(9, 20), listOf(3))
        Assert.assertEquals(expected, solution.levelOrderBottom(tree))
    }
}