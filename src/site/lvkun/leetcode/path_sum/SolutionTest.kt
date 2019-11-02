package site.lvkun.leetcode.path_sum

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testHasPathSum() {
        val solution = Solution()
        val tree = TreeNode(5,
                TreeNode(4,
                        TreeNode(11,
                                TreeNode(7),
                                TreeNode(2))),
                TreeNode(8,
                        TreeNode(13),
                        TreeNode(4,
                                null,
                                TreeNode(1))))
        Assert.assertTrue(solution.hasPathSum(tree, 22))

        Assert.assertFalse(solution.hasPathSum(null, 0))
    }
}