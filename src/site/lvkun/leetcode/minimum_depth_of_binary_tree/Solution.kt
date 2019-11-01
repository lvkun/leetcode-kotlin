package site.lvkun.leetcode.minimum_depth_of_binary_tree

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun minDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        if (root.left == null) {
            return 1 + minDepth(root.right)
        }

        if (root.right == null) {
            return 1 + minDepth(root.left)
        }

        return 1 + minOf(minDepth(root.left), minDepth(root.right))
    }
}