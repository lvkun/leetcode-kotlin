package site.lvkun.leetcode.palindrome_linked_list

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.ListNode

class SolutionTest {
    @Test
    fun testIsPalindrome() {
        val solution = Solution()
        Assert.assertFalse(solution.isPalindrome(ListNode.fromString("1->2")))
        Assert.assertTrue(solution.isPalindrome(ListNode.fromString("1")))
        Assert.assertTrue(solution.isPalindrome(ListNode.fromString("1->2->2->1")))
        Assert.assertTrue(solution.isPalindrome(ListNode.fromString("1->2->2->2->1")))
        Assert.assertFalse(solution.isPalindrome(ListNode.fromString("1->3->2->4->3->2->1")))
    }
}