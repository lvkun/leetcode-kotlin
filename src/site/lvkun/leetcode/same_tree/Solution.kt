package site.lvkun.leetcode.same_tree

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) {
            return true
        }

        return p?.`val` == q?.`val` && isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
    }
}