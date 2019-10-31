package site.lvkun.leetcode.symmetric_tree

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }

        return isSymmetric(root.left, root.right)
    }

    fun isSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) {
            return true
        }

        return left?.`val` == right?.`val` && isSymmetric(left?.left, right?.right) && isSymmetric(left?.right, right?.left)
    }
}