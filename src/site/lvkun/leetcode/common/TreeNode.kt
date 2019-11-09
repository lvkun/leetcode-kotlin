package site.lvkun.leetcode.common

import java.util.*

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    constructor(value: Int, leftNode: TreeNode? = null, rightNode: TreeNode? = null) : this(value){
        left = leftNode
        right = rightNode
    }


    override fun toString(): String {
        val result = Stack<String>()

        val queue = ArrayDeque<TreeNode>()
        queue.add(this)

        while (queue.size > 0) {
            val node = queue.poll()

            if (node !== NULL) {
                result.add(node.`val`.toString())
            } else {
                result.add("null")
                continue
            }

            if (node.left != null) {
                queue.offer(node.left)
            } else {
                queue.offer(NULL)
            }
            if (node.right != null) {
                queue.offer(node.right)
            } else {
                queue.offer(NULL)
            }
        }

        while (result.peek() == "null") {
            result.pop()
        }

        return "[" + result.joinToString(",") + "]"
    }

    override fun equals(other: Any?): Boolean {
        if (other == null) {
            return false
        }

        if (other !is TreeNode) {
            return false
        }

        return this.`val` == other.`val` && this.left == other.left && this.right == other.right
    }

    companion object {
        private val NULL = TreeNode(-1)
    }
}