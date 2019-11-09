package site.lvkun.leetcode.invert_binary_tree

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode
import kotlin.math.exp

class SolutionTest {
    @Test
    fun testInvertTree() {
        val solution = Solution()
        val result = solution.invertTree(TreeNode(4,
                TreeNode(2,
                        TreeNode(1),
                        TreeNode(3)),
                TreeNode(7,
                        TreeNode(6),
                        TreeNode(9))))
        val expected = TreeNode(4,
                TreeNode(7,
                        TreeNode(9),
                        TreeNode(6)),
                TreeNode(2,
                        TreeNode(3),
                        TreeNode(1)))
        Assert.assertEquals(expected, result)
    }
}