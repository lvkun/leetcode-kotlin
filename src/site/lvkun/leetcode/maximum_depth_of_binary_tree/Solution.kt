package site.lvkun.leetcode.maximum_depth_of_binary_tree

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        return 1 + maxOf(maxDepth(root.left), maxDepth(root.right))
    }
}