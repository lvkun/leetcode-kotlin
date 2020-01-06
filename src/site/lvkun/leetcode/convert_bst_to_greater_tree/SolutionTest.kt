package site.lvkun.leetcode.convert_bst_to_greater_tree

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testConvertBST() {
        val solution = Solution()
        Assert.assertEquals(TreeNode(18,
                TreeNode(20),
                TreeNode(13)), solution.convertBST(
                TreeNode(5,
                        TreeNode(2),
                        TreeNode(13))))
    }
}