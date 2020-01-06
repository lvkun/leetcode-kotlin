package site.lvkun.leetcode.diameter_of_binary_tree

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testDiameterOfBinaryTree() {
        val solution = Solution()
        Assert.assertEquals(3, solution.diameterOfBinaryTree(
                TreeNode(1,
                        TreeNode(2,
                                TreeNode(4),
                                TreeNode(5)),
                        TreeNode(3))
        ))
    }
}