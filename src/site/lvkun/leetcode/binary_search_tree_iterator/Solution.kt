package site.lvkun.leetcode.binary_search_tree_iterator

import site.lvkun.leetcode.common.TreeNode
import java.util.*

class BSTIterator(root: TreeNode?) {
    val stack = Stack<TreeNode>()
    init {
        addStack(root)
    }

    private fun addStack(node: TreeNode?) {
        var cur = node
        while (cur != null) {
            stack.push(cur)
            cur = cur.left
        }
    }

    /** @return the next smallest number */
    fun next(): Int {
        val cur = stack.pop()
        val right = cur.right
        if (right != null) {
            addStack(right)
        }
        return cur.`val`
    }

    /** @return whether we have a next smallest number */
    fun hasNext(): Boolean {
        return stack.isNotEmpty()
    }
}