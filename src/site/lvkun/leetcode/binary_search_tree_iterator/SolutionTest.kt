package site.lvkun.leetcode.binary_search_tree_iterator

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.TreeNode

class SolutionTest {
    @Test
    fun testBSTIterator() {
        val root = TreeNode(7,
                TreeNode(3),
                TreeNode(15,
                        TreeNode(9),
                        TreeNode(20)))

        val iterator = BSTIterator(root)
        Assert.assertEquals(3, iterator.next())
        Assert.assertEquals(7, iterator.next())
        Assert.assertTrue(iterator.hasNext())
        Assert.assertEquals(9, iterator.next())
        Assert.assertTrue(iterator.hasNext())
        Assert.assertEquals(15, iterator.next())
        Assert.assertTrue(iterator.hasNext())
        Assert.assertEquals(20, iterator.next())
        Assert.assertFalse(iterator.hasNext())
    }
}