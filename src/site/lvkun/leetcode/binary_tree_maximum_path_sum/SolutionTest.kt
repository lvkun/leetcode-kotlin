package site.lvkun.leetcode.binary_tree_maximum_path_sum

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testMaxPathSum() {
        val solution = Solution()
        Assert.assertEquals(6, solution.maxPathSum(TreeNode(1,
                TreeNode(2),
                TreeNode(3))))
        Assert.assertEquals(42, solution.maxPathSum(TreeNode(-10,
                TreeNode(9),
                TreeNode(20,
                        TreeNode(15),
                        TreeNode(7)))))
    }
}