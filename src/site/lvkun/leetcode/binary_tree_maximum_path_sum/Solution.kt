package site.lvkun.leetcode.binary_tree_maximum_path_sum

import site.lvkun.leetcode.common.TreeNode

class Solution {
    private var maxSum = Int.MIN_VALUE

    fun maxPathSum(root: TreeNode?): Int {
        maxSum = Int.MIN_VALUE
        maxPathSumInternal(root)
        return maxSum
    }

    fun maxPathSumInternal(node: TreeNode?): Int {
        if (node == null) {
            return 0
        }

        val leftSum = maxOf(maxPathSumInternal(node.left),0)
        val rightSum = maxOf(maxPathSumInternal(node.right), 0)

        maxSum = maxOf(maxSum, node.`val` + leftSum + rightSum)

        return node.`val` + maxOf(leftSum, rightSum)
    }
}