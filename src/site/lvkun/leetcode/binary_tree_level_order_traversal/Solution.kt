package site.lvkun.leetcode.binary_tree_level_order_traversal

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val resultList = mutableListOf<List<Int>>()

        var queue = mutableListOf<TreeNode>()
        queue.add(root!!)

        while (queue.isNotEmpty()) {
            val nextLevel = mutableListOf<TreeNode>()
            val result = mutableListOf<Int>()
            for (node in queue) {
                result.add(node.`val`)

                val left = node.left
                val right = node.right
                if (left != null) {
                    nextLevel.add(left)
                }
                if (right != null) {
                    nextLevel.add(right)
                }
            }

            queue = nextLevel
            resultList.add(result)
        }

        return resultList
    }
}