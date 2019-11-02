package site.lvkun.leetcode.min_stack

import java.util.*

class MinStack() {

    private val stack = Stack<Int>()
    private val minStack = Stack<Int>()

    fun push(x: Int) {
        stack.push(x)
        if (minStack.empty() || x <= minStack.peek()) {
            minStack.push(x)
        }
    }

    fun pop() {
        val x = stack.pop()
        if (x == minStack.peek()) {
            minStack.pop()
        }
    }

    fun top(): Int {
        return stack.peek()
    }

    fun getMin(): Int {
        return minStack.peek()
    }
}