package site.lvkun.leetcode.range_sum_of_bst

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testRangeSumBST() {
        val solution = Solution()
        Assert.assertEquals(32, solution.rangeSumBST(TreeNode(10,
                TreeNode(5,
                        TreeNode(3),
                        TreeNode(7)),
                TreeNode(15,
                        null,
                        TreeNode(18))), 7, 15))
        Assert.assertEquals(23, solution.rangeSumBST(TreeNode(10,
                TreeNode(5,
                        TreeNode(3,
                                TreeNode(1),
                                null),
                        TreeNode(7,
                                TreeNode(6),
                                null)),
                TreeNode(15,
                        TreeNode(1),
                        TreeNode(18))), 6, 10))
    }
}