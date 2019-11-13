package site.lvkun.leetcode.merge_k_sorted_lists

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.ListNode

class SolutionTest {
    @Test
    fun testMergeKLists() {
        val solution = Solution()
        val result = solution.mergeKLists(arrayOf(
                ListNode.fromString("1->4->5"),
                ListNode.fromString("1->3->4"),
                ListNode.fromString("2->6")))
        val expected = ListNode.fromString("1->1->2->3->4->4->5->6")
        Assert.assertEquals(expected, result)
    }
}