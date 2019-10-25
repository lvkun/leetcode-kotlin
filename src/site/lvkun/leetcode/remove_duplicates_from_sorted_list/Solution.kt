package site.lvkun.leetcode.remove_duplicates_from_sorted_list

import site.lvkun.leetcode.common.ListNode

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var cur = head
        while (cur != null) {
            if (cur.next?.value == cur.value) {
                cur.next = cur.next?.next
            } else {
                cur = cur.next
            }
        }

        return head
    }
}