package site.lvkun.leetcode.remove_linked_list_elements

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.ListNode

class SolutionTest {
    @Test
    fun test() {
        val solution = Solution()
        var result = solution.removeElements(ListNode.fromString("1->2->6->3->4->5->6"), 6)
        Assert.assertEquals("1->2->3->4->5", result.toString())
    }
}