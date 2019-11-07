package site.lvkun.leetcode.reverse_linked_list

import site.lvkun.leetcode.common.ListNode

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        val dummy = ListNode(-1)
        dummy.next = head
        var cur = head
        var next = cur?.next
        var nnext = next?.next

        while (next != null) {
            next.next = cur
            cur = next
            next = nnext
            nnext = next?.next
        }

        dummy.next?.next = null

        return cur
    }
}