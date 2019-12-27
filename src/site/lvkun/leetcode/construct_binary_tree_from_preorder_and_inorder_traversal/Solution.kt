package site.lvkun.leetcode.construct_binary_tree_from_preorder_and_inorder_traversal

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        return buildTree(preorder, IntRange(0, preorder.lastIndex),
                inorder, IntRange(0, inorder.lastIndex))
    }

    fun IntArray.indexOf(v: Int, range: IntRange): Int {
        for (i in range) {
            if (this[i] == v) {
                return i
            }
        }

        return -1
    }

    fun buildTree(preorder: IntArray, preRange: IntRange, inorder: IntArray, inRange: IntRange): TreeNode? {
        if (preRange.isEmpty()) {
            return null
        }

        val value = preorder[preRange.first]

        val inIndex = inorder.indexOf(value, inRange)
        val leftLength = inIndex - inRange.first

        val node = TreeNode(value)

        node.left = buildTree(preorder, IntRange(preRange.first + 1, preRange.first + leftLength),
                inorder, IntRange(inRange.first, inIndex - 1))
        node.right = buildTree(preorder, IntRange(preRange.first + 1 + leftLength, preRange.last),
                inorder, IntRange(inIndex + 1, inRange.last))

        return node
    }
}