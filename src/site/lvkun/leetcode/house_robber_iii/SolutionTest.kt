package site.lvkun.leetcode.house_robber_iii

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testRob() {
        val solution = Solution()
        Assert.assertEquals(7, solution.rob(
                TreeNode(3,
                        TreeNode(2,
                                null,
                                TreeNode(3)),
                        TreeNode(3,
                                null,
                                TreeNode(1)))))
        Assert.assertEquals(9, solution.rob(
                TreeNode(3,
                        TreeNode(4,
                                TreeNode(1),
                                TreeNode(3)),
                        TreeNode(5,
                                null,
                                TreeNode(1)))))
    }
}