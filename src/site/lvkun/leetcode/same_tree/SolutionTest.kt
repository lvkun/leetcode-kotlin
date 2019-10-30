package site.lvkun.leetcode.same_tree

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testIsSameTree() {
        val solution = Solution()
        Assert.assertTrue(solution.isSameTree(
                TreeNode(1, TreeNode(2), TreeNode(3)),
                TreeNode(1, TreeNode(2), TreeNode(3))))
        Assert.assertFalse(solution.isSameTree(
                TreeNode(1, TreeNode(2)),
                TreeNode(1, null, TreeNode(3))))
        Assert.assertFalse(solution.isSameTree(
                TreeNode(1, TreeNode(3), TreeNode(2)),
                TreeNode(1, TreeNode(2), TreeNode(3))))
    }
}