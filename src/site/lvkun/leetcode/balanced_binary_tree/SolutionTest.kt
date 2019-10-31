package site.lvkun.leetcode.balanced_binary_tree

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testIsBalanced() {
        val solution = Solution()
        var tree = TreeNode(3,
            TreeNode(9),
            TreeNode(20, TreeNode(15), TreeNode(7)))
        Assert.assertTrue(solution.isBalanced(tree))

        tree = TreeNode(1,
            TreeNode(2,
                TreeNode(3,
                    TreeNode(4),
                    TreeNode(4)
                ),
                TreeNode(3)
            ),
            TreeNode(2)
        )
        Assert.assertFalse(solution.isBalanced(tree))
    }
}