package site.lvkun.leetcode.reverse_nodes_in_k_group

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.ListNode

class SolutionTest {
    @Test
    fun testReverseKGroup() {
        val solution = Solution()
        var result = solution.reverseKGroup(ListNode.fromString("1->2->3->4->5"), 2)
        Assert.assertEquals(ListNode.fromString("2->1->4->3->5"), result)
        result = solution.reverseKGroup(ListNode.fromString("1->2->3->4->5"), 3)
        Assert.assertEquals(ListNode.fromString("3->2->1->4->5"), result)

        result = solution.reverseKGroup(ListNode.fromString("1->2"), 2)
        Assert.assertEquals(ListNode.fromString("2->1"), result)
    }
}