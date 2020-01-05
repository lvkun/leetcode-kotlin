package site.lvkun.leetcode.path_sum_iii

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun pathSum(root: TreeNode?, sum: Int): Int {
        if (root == null) {
            return 0
        }

        return pathSum(root.left, sum) + pathSum(root.right, sum) + pathSumPartial(root, sum)
    }

    fun pathSumPartial(root: TreeNode?, partialSum: Int): Int {
        if (root == null) {
            return 0
        }

        val newPartialSum = partialSum - root.`val`

        return if (newPartialSum == 0) {
            1
        } else { 0 } + pathSumPartial(root.left, newPartialSum) + pathSumPartial(root.right, newPartialSum)
    }
}