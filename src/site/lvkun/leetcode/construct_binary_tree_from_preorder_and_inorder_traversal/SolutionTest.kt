package site.lvkun.leetcode.construct_binary_tree_from_preorder_and_inorder_traversal

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testBuildTree() {
        val solution = Solution()
        val result = solution.buildTree(intArrayOf(3,9,20,15,7), intArrayOf(9,3,15,20,7))
        val expected = TreeNode(3,
                TreeNode(9),
                TreeNode(20,
                        TreeNode(15),
                        TreeNode(7)))
        Assert.assertEquals(expected, result)
    }
}