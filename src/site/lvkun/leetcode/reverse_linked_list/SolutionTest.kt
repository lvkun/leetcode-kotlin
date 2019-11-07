package site.lvkun.leetcode.reverse_linked_list

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.ListNode

class SolutionTest {
    @Test
    fun testReverseList() {
        val solution = Solution()
        Assert.assertEquals("5->4->3->2->1", solution.reverseList(ListNode.fromString("1->2->3->4->5")).toString())
    }
}