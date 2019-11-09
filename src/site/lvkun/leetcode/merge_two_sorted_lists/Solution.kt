package site.lvkun.leetcode.merge_two_sorted_lists

import site.lvkun.leetcode.common.ListNode

class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummy = ListNode(-1)
        var cur = dummy
        var n1 = l1
        var n2 = l2
        while (n1 != null && n2 != null) {
            if (n1.`val` <= n2.`val`) {
                cur.next = n1
                cur = n1
                n1 = n1.next
            } else {
                cur.next = n2
                cur = n2
                n2 = n2.next
            }
        }

        if (n1 != null) {
            cur.next = n1
        }

        if (n2 != null) {
            cur.next = n2
        }

        return dummy.next
    }
}