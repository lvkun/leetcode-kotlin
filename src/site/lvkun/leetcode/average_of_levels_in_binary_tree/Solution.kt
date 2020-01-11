package site.lvkun.leetcode.average_of_levels_in_binary_tree

import site.lvkun.leetcode.common.TreeNode
import java.util.*

class Solution {
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        if (root == null) {
            return DoubleArray(0)
        }

        val result = mutableListOf<Double>()
        var queue = ArrayDeque<TreeNode>()
        queue.offer(root)
        while (queue.isNotEmpty()) {
            val next = ArrayDeque<TreeNode>()
            val level = mutableListOf<Int>()
            while (queue.isNotEmpty()) {
                val node = queue.poll()
                node.left?.let {
                    next.offer(it)
                }
                node.right?.let {
                    next.offer(it)
                }

                level.add(node.`val`)
            }
            result.add(level.average())
            queue = next
        }

        return result.toDoubleArray()
    }
}