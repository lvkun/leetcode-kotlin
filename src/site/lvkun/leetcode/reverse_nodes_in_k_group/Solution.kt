package site.lvkun.leetcode.reverse_nodes_in_k_group

import site.lvkun.leetcode.common.ListNode

class Solution {

    private class LinkedStack {
        private val dummy = ListNode(0)

        private var tail: ListNode? = null

        fun push(node: ListNode?) {
            if (tail == null) {
                tail = node
            }

            node?.next = dummy.next
            dummy.next = node
        }

        fun pop(): ListNode? {
            val top = dummy.next
            dummy.next = null
            return top
        }

        fun tail(): ListNode? {
            val t = tail
            tail = null
            return t
        }
    }

    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        if (k <= 1) {
            return head
        }

        val dummy = ListNode(-1)

        var cur = head
        val stack = LinkedStack()
        var newHead: ListNode? = dummy
        while (lengthGreaterThan(cur, k)) {
            for (i in 0 until k) {
                val next = cur?.next
                stack.push(cur)
                cur = next
            }
            newHead?.next = stack.pop()
            newHead = stack.tail()
            newHead?.next = null
        }

        newHead?.next = cur

        return dummy.next
    }

    private fun lengthGreaterThan(node: ListNode?, k: Int): Boolean {
        var count = 0
        var cur = node
        while (cur != null && count < k) {
            count++
            cur = cur.next
        }

        return count == k
    }
}