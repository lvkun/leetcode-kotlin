package site.lvkun.leetcode.binary_tree_inorder_traversal

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testInorderTraversal() {
        val solution = Solution()
        var root = TreeNode(1,
                null,
                TreeNode(2,
                        TreeNode(3),
                        null))
//        var result = solution.inorderTraversal(root)
//        Assert.assertEquals(listOf(1, 3, 2), result)

        root = TreeNode(2,
                TreeNode(3,
                        TreeNode(1),
                        null),
                null)
        var result = solution.inorderTraversal(root)
        Assert.assertEquals(listOf(1, 3, 2), result)
    }
}