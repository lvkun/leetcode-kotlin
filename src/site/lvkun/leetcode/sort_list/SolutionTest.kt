package site.lvkun.leetcode.sort_list

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.ListNode

class SolutionTest {
    @Test
    fun testSortList() {
        val solution = Solution()
        Assert.assertEquals(ListNode.fromString("1->2->3->4"),
                solution.sortList(ListNode.fromString("4->2->1->3")))

        Assert.assertEquals(ListNode.fromString("-1->0->3->4->5"),
                solution.sortList(ListNode.fromString("-1->5->3->4->0")))
    }
}