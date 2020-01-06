package site.lvkun.leetcode.convert_bst_to_greater_tree

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun convertBST(root: TreeNode?): TreeNode? {
        convertBST(root, 0)
        return root
    }

    fun convertBST(node: TreeNode?, fromTop: Int): Int {
        if (node == null) {
            return fromTop
        }

        val right = convertBST(node.right, fromTop)

        node.`val` += right

        return convertBST(node.left, node.`val`)
    }
}