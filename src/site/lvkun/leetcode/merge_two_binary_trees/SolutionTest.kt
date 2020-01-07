package site.lvkun.leetcode.merge_two_binary_trees

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testMergeTrees() {
        val solution = Solution()
        Assert.assertEquals(
                TreeNode(3,
                        TreeNode(4,
                                TreeNode(5),
                                TreeNode(4)),
                        TreeNode(5,
                                null,
                                TreeNode(7))),
                solution.mergeTrees(
                        TreeNode(1,
                                TreeNode(3,
                                        TreeNode(5),
                                        null),
                                TreeNode(2)),
                        TreeNode(2,
                                TreeNode(1,
                                        null,
                                        TreeNode(4)),
                                TreeNode(3,
                                        null,
                                        TreeNode(7)))))
    }
}