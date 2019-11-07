package site.lvkun.leetcode.implement_stack_using_queues

import java.util.*

class MyStack() {
    /** Initialize your data structure here. */
    val queue = LinkedList<Int>()

    /** Push element x onto stack. */
    fun push(x: Int) {
        queue.add(x)
        var size = queue.size
        while (size > 1) {
            queue.add(queue.remove())
            size--
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int {
        return queue.remove()
    }

    /** Get the top element. */
    fun top(): Int {
        return queue.peek()
    }

    /** Returns whether the stack is empty. */
    fun empty(): Boolean {
        return queue.isEmpty()
    }

}
