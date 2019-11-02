package site.lvkun.leetcode.path_sum

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
            if (root == null) {
                return false
            }

            if (root.left == null && root.right == null) {
                return sum == root.`val`
            }

            val nextSum = sum - root.`val`
            return hasPathSum(root.left, nextSum) || hasPathSum(root.right, nextSum)
    }
}