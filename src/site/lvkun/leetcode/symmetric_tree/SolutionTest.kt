package site.lvkun.leetcode.symmetric_tree

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testIsSymmetric() {
        val solution = Solution()
        Assert.assertTrue(
                solution.isSymmetric(
                        TreeNode(1,
                                TreeNode(2, TreeNode(3), TreeNode(4)),
                                TreeNode(2, TreeNode(4), TreeNode(3)))))

        Assert.assertFalse(
                solution.isSymmetric(
                        TreeNode(1,
                                TreeNode(2, null, TreeNode(3)),
                                TreeNode(2, null, TreeNode(3)))))
    }
}