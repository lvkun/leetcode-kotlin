package site.lvkun.leetcode.flatten_binary_tree_to_linked_list

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun flatten(root: TreeNode?): Unit {
        if (root == null) {
            return
        }

        flatterInternal(root)
    }

    fun flatterInternal(root: TreeNode): Pair<TreeNode, TreeNode> {
        val left = root.left
        val right = root.right

        var tail = root
        if (left != null) {
            val leftPair = flatterInternal(left)
            tail.left = null
            tail.right = leftPair.first
            tail = leftPair.second
        }

        if (right != null) {
            val rightPair = flatterInternal(right)
            tail.left = null
            tail.right = rightPair.first
            tail = rightPair.second
        }

        return Pair(root, tail)
    }
}