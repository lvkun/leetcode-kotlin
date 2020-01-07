package site.lvkun.leetcode.merge_two_binary_trees

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null && t2 == null) {
            return null
        }

        val n = (t1?.`val` ?: 0) + (t2?.`val` ?: 0)
        val node = TreeNode(n)

        node.left = mergeTrees(t1?.left, t2?.left)
        node.right = mergeTrees(t1?.right, t2?.right)

        return node
    }
}