package site.lvkun.leetcode.sort_list

import site.lvkun.leetcode.common.ListNode

class Solution {
    fun sortList(head: ListNode?): ListNode? {
        val dummy = ListNode(-1)
        dummy.next = head

        var length = 0
        var cur = head
        while (cur != null) {
            cur = cur.next
            length++
        }

        var step = 1
        while (step < length) {
            var prev = dummy
            cur = prev.next

            var list1 = next(cur, step)
            var list2 = next(list1.second, step)

            while (list1.first != null && list2.first != null) {
                val tail = list2.second
                val result = merge(list1.first!!, list2.first!!)
                prev.next = result.first
                result.second.next = tail
                prev = result.second
                prev.next = tail
                cur = prev.next

                list1 = next(cur, step)
                list2 = next(list1.second, step)
            }

            step *= 2
        }

        return dummy.next
    }

    fun next(head: ListNode?, n: Int): Pair<ListNode?, ListNode?> {
        var cur = head
        var prev = cur
        var count = n
        while (cur != null && count > 0) {
            prev = cur
            cur = cur.next
            count--
        }
        prev?.next = null

        return Pair(head, cur)
    }

    fun merge(list1: ListNode, list2: ListNode): Pair<ListNode, ListNode> {
        val dummy = ListNode(-1)

        var prev = dummy

        var l1: ListNode? = list1
        var l2: ListNode? = list2

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.`val` < l2.`val`) {
                    prev.next = l1
                    prev = l1
                    l1 = l1.next
                } else {
                    prev.next = l2
                    prev = l2
                    l2 = l2.next
                }
            } else if (l1 != null) {
                prev.next = l1
                prev = l1
                l1 = l1.next
            } else if (l2 != null) {
                prev.next = l2
                prev = l2
                l2 = l2.next
            }
        }

        return Pair(dummy.next!!, prev)
    }
}