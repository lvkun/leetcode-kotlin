package site.lvkun.leetcode.implement_queue_using_stacks

import java.util.*

class MyQueue() {

    /** Initialize your data structure here. */
    private val stack1 = Stack<Int>()
    private val stack2 = Stack<Int>()

    var front: Int? = null

    /** Push element x to the back of queue. */
    fun push(x: Int) {
        if (stack1.empty()) {
            front = x
        }
        stack1.push(x)
    }

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop())
            }
        }
        return stack2.pop()
    }

    /** Get the front element. */
    fun peek(): Int {
        if (!stack2.empty()) {
            return stack2.peek()
        }

        return front!!
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean {
        return stack1.empty() && stack2.empty()
    }

}
