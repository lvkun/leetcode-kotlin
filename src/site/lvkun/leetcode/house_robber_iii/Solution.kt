package site.lvkun.leetcode.house_robber_iii

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun rob(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        return rob(root, true)
    }

    fun rob(root: TreeNode?, include: Boolean): Int {
        if (root == null) {
            return 0
        }

        if (include) {
            return maxOf(root.`val` + rob(root.left, false) + rob(root.right, false),
                    rob(root.left, true) + rob(root.right, true))
        }

        return rob(root.left, true) + rob(root.right, true)
    }
}