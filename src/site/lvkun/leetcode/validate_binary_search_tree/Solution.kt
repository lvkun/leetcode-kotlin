package site.lvkun.leetcode.validate_binary_search_tree

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        return isValidBST(root, LongRange(Long.MIN_VALUE, Long.MAX_VALUE))
    }

    fun isValidBST(node: TreeNode?, range: LongRange): Boolean {
        if (node == null) {
            return true
        }

        if (!range.contains(node.`val`)) {
            return false
        }

        return isValidBST(node.left, LongRange(range.first, node.`val`.toLong() - 1)) &&
                isValidBST(node.right, LongRange(node.`val`.toLong() + 1, range.last))
    }
}
