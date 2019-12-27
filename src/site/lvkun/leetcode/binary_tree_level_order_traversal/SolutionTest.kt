package site.lvkun.leetcode.binary_tree_level_order_traversal

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testLevelOrder() {
        val solution = Solution()
        val result = solution.levelOrder(TreeNode(3,
                TreeNode(9),
                TreeNode(20,
                        TreeNode(15),
                        TreeNode(7))))
        val expected = listOf(
                listOf(3),
                listOf(9,20),
                listOf(15,7)
        )
        Assert.assertEquals(expected, result)
    }
}