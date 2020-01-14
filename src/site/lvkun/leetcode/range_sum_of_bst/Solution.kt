package site.lvkun.leetcode.range_sum_of_bst

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun rangeSumBST(root: TreeNode?, L: Int, R: Int): Int {
        if (root == null) {
            return 0
        }

        val v = root.`val`
        if (v in L..R) {
            return v + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R)
        }

        if (v < L) {
            return rangeSumBST(root.right, L, R)
        }

        return rangeSumBST(root.left, L, R)
    }
}