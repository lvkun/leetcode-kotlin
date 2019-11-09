package site.lvkun.leetcode.palindrome_linked_list

import site.lvkun.leetcode.common.ListNode

class Solution {
    fun reverseList(head: ListNode?, end: ListNode?): ListNode? {
        var dummy = ListNode(-1)
        dummy.next = head
        var cur = head
        var next: ListNode? = cur?.next ?: return head
        var nnext = next?.next

        while (next != end) {
            val temp = nnext
            next?.next = cur
            cur = next
            nnext = nnext?.next
            next = temp
        }

        dummy.next?.next = null

        return cur
    }

    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null) {
            return true
        }

        if (head.next == null) {
            return true
        }

        var fast = head
        var slow = head

        var size = 1

        while (fast?.next != null) {
            size += if (fast.next?.next == null) {
                1
            } else {
                2
            }

            fast = fast.next?.next
            slow = slow?.next
        }

        var h1 = reverseList(head, slow)
        var h2 = slow

        if (size % 2 == 1) {
            h2 = h2?.next
        }

        while (h1 != null) {
            if (h1.`val` != h2?.`val`) {
                return false
            }
            h1 = h1.next
            h2 = h2.next
        }


        return h2 == null
    }
}