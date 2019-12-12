package site.lvkun.leetcode.remove_nth_node_from_end_of_list

import site.lvkun.leetcode.common.ListNode

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val dummy = ListNode(-1)
        dummy.next = head

        var fast = dummy.next

        for (i in 0 until n) {
            fast = fast?.next
            if (fast == null) {
                break
            }
        }

        var cur = dummy.next
        var prev: ListNode? = dummy
        while (fast != null) {
            fast = fast.next
            cur = cur?.next
            prev = prev?.next
        }

        prev?.next = cur?.next
        cur?.next = null

        return dummy.next
    }
}