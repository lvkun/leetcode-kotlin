package site.lvkun.leetcode.balanced_binary_tree

import site.lvkun.leetcode.common.TreeNode
import kotlin.math.abs

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        return isBalancedInternal(root) != -1
    }

    private fun isBalancedInternal(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        val left = isBalancedInternal(root.left)
        val right = isBalancedInternal(root.right)

        if (left == -1 || right == -1 || abs(right - left) > 1) {
            return -1
        }

        return maxOf(left, right) + 1
    }
}