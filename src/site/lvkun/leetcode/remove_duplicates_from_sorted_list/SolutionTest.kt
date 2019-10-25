package site.lvkun.leetcode.remove_duplicates_from_sorted_list

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.ListNode

class SolutionTest {
    @Test
    fun testDeleteDuplicates() {
        val solution = Solution()
        var result = solution.deleteDuplicates(ListNode.fromString("1->1->2"))
        Assert.assertEquals("1->2", result.toString())
        result = solution.deleteDuplicates(ListNode.fromString("1->1->2->3->3"))
        Assert.assertEquals("1->2->3", result.toString())
    }
}