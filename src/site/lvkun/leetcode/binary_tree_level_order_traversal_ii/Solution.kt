package site.lvkun.leetcode.binary_tree_level_order_traversal_ii

import site.lvkun.leetcode.common.TreeNode
import java.util.*

class Solution {
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        val result = ArrayDeque<List<Int>>()

        var level = mutableListOf<TreeNode>()
        if (root != null) {
            level.add(root)
        }

        while (level.isNotEmpty()) {
            val levelResult = mutableListOf<Int>()
            val nextLevel = mutableListOf<TreeNode>()

            for (node in level) {
                levelResult.add(node.`val`)
                node.left ?.let { nextLevel.add(it) }
                node.right ?.let { nextLevel.add(it) }
            }

            result.addFirst(levelResult)

            level = nextLevel
        }

        return result.toList()
    }
}
