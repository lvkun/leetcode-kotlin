package site.lvkun.leetcode.diameter_of_binary_tree

import site.lvkun.leetcode.common.TreeNode

class Solution {
    var diameter = 0

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        diameterOfBinaryTreeInternal(root)
        return diameter
    }

    fun diameterOfBinaryTreeInternal(node: TreeNode?): Int {
        if (node == null) {
            return 0
        }

        val left = diameterOfBinaryTreeInternal(node.left)
        val right = diameterOfBinaryTreeInternal(node.right)

        diameter = maxOf(diameter, left + right)

        return 1 + maxOf(left, right)
    }
}