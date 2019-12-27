package site.lvkun.leetcode.flatten_binary_tree_to_linked_list

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testFlatten() {
        val solution = Solution()
        val result = TreeNode(1,
                TreeNode(2,
                        TreeNode(3),
                        TreeNode(4)),
                TreeNode(5,
                        null,
                        TreeNode(6)))
        solution.flatten(result)
        val expected = TreeNode(1,
                null,
                TreeNode(2,
                        null,
                        TreeNode(3,
                                null,
                                TreeNode(4,
                                        null,
                                        TreeNode(5,
                                                null,
                                                TreeNode(6))))))
        Assert.assertEquals(expected, result)
    }
}