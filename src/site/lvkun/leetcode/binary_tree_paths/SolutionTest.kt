package site.lvkun.leetcode.binary_tree_paths

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode
import kotlin.math.exp

class SolutionTest {
    @Test
    fun testBinaryTreePaths() {
        val solution = Solution()
        val result = solution.binaryTreePaths(TreeNode(1,
                TreeNode(2,
                        null,
                        TreeNode(5)),
                TreeNode(3)))
        val expected = listOf("1->2->5", "1->3")
        Assert.assertEquals(expected, result)
    }
}