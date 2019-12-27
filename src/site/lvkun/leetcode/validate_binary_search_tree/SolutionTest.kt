package site.lvkun.leetcode.validate_binary_search_tree

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testIsValidBST() {
        val solution = Solution()
        Assert.assertTrue(solution.isValidBST(TreeNode(2,
                TreeNode(1),
                TreeNode(3))))
        Assert.assertFalse(solution.isValidBST(TreeNode(5,
                TreeNode(1),
                TreeNode(4,
                        TreeNode(3),
                        TreeNode(6)))))
    }
}