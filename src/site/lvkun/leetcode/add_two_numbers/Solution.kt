package site.lvkun.leetcode.add_two_numbers

import site.lvkun.leetcode.common.ListNode

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var carry = 0

        val dummy = ListNode(-1)
        var node = dummy

        var node1 = l1
        var node2 = l2

        while (node1 != null || node2 != null || carry != 0) {
            val v1 = node1?.`val` ?: 0
            val v2 = node2?.`val` ?: 0

            val sum = v1 + v2 + carry
            val v = sum % 10
            carry = sum / 10

            node.next = ListNode(v)
            node = node.next!!

            node1 = node1?.next
            node2 = node2?.next
        }

        return dummy.next
    }
}