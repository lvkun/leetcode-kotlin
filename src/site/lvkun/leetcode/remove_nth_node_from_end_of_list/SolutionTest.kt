package site.lvkun.leetcode.remove_nth_node_from_end_of_list

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.ListNode

class SolutionTest {
    @Test
    fun testRemoveNthFromEnd() {
        val solution = Solution()
        var result = solution.removeNthFromEnd(ListNode.fromString("1->2->3->4->5"), 2)
        Assert.assertEquals(ListNode.fromString("1->2->3->5"), result)

        result = solution.removeNthFromEnd(ListNode.fromString("1->2"), 2)
        Assert.assertEquals(ListNode.fromString("2"), result)
    }
}