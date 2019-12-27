package site.lvkun.leetcode.binary_tree_inorder_traversal

import site.lvkun.leetcode.common.TreeNode
import java.util.*

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) {
            return emptyList()
        }

        val stack = Stack<TreeNode>()
        val result = mutableListOf<Int>()

        var cur = root

        while (cur != null || stack.isNotEmpty()) {

            while (cur != null) {
                stack.push(cur)
                cur = cur.left
            }

            cur = stack.pop()
            result.add(cur.`val`)

            cur = cur.right
        }

        return result
    }
}