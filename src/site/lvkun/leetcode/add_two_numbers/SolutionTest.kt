package site.lvkun.leetcode.add_two_numbers

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.ListNode

class SolutionTest {
    @Test
    fun testAddTwoNumbers() {
        val solution = Solution()
        val result = solution.addTwoNumbers(ListNode.fromString("2 -> 4 -> 3"), ListNode.fromString("5 -> 6 -> 4"))
        Assert.assertEquals(ListNode.fromString("7 -> 0 -> 8"), result)
    }
}