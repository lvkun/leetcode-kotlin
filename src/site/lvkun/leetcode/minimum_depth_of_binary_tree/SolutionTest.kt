package site.lvkun.leetcode.minimum_depth_of_binary_tree

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testMinDepth() {
        val solution = Solution()
        val tree = TreeNode(3,
                TreeNode(9),
                TreeNode(20,
                        TreeNode(15),
                        TreeNode(7)))
        Assert.assertEquals(2, solution.minDepth(tree))

        Assert.assertEquals(2, solution.minDepth(TreeNode(1, TreeNode(2))))

        Assert.assertEquals(0, solution.minDepth(null))
    }
}