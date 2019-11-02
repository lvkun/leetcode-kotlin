package site.lvkun.leetcode.min_stack

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMinStack() {
        val minStack = MinStack()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        Assert.assertEquals(-3, minStack.getMin())
        minStack.pop()
        Assert.assertEquals(0, minStack.top())
        Assert.assertEquals(-2, minStack.getMin())
    }
}