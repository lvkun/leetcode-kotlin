package site.lvkun.leetcode.merge_two_sorted_lists

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.ListNode

class SolutionTest {
    @Test
    fun testMergeTwoLists() {
        var l1 = ListNode.fromString("1->2->4")
        var l2 = ListNode.fromString("1->3->4")

        val solution = Solution()
        var result = solution.mergeTwoLists(l1, l2)
        Assert.assertEquals("1->1->2->3->4->4", result.toString())
    }
}