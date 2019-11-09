package site.lvkun.leetcode.remove_linked_list_elements

import site.lvkun.leetcode.common.ListNode

class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        val dummy = ListNode(-1)
        dummy.next = head

        var cur: ListNode? = dummy
        var next = cur?.next
        while (next != null) {

            if (next.`val` == `val`) {
                cur?.next = next.next
                next = cur?.next
            } else {
                cur = cur?.next
                next = cur?.next
            }
        }

        return dummy.next
    }
}