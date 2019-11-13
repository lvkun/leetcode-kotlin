package site.lvkun.leetcode.merge_k_sorted_lists

import site.lvkun.leetcode.common.ListNode
import java.util.*
import kotlin.Comparator

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val dummy = ListNode(0)
        var prev = dummy

        val queue = PriorityQueue<ListNode>(Comparator<ListNode> { node1, node2 -> node1.`val` - node2.`val` })

        for (node in lists) {
            if (node != null) {
                queue.add(node)
            }
        }

        while (queue.isNotEmpty()) {
            val node = queue.poll()

            prev.next = node
            prev = node

            if (prev.next != null) {
                queue.add(prev.next)
            }
        }

        return dummy.next
    }
}