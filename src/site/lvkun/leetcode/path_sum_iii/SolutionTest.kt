package site.lvkun.leetcode.path_sum_iii

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testPathSum() {
        val solution = Solution()
        Assert.assertEquals(3, solution.pathSum(
                TreeNode(10,
                    TreeNode(5,
                            TreeNode(3,
                                    TreeNode(3),
                                    TreeNode(-2)),
                            TreeNode(2,
                                    null,
                                    TreeNode(1))),
                    TreeNode(-3,
                            null,
                            TreeNode(11))), 8))
        Assert.assertEquals(2, solution.pathSum(
                TreeNode(1,
                        null,
                        TreeNode(2,
                                null,
                                TreeNode(3,
                                        null,
                                        TreeNode(4,
                                                null,
                                                TreeNode(5))))),3))
    }
}