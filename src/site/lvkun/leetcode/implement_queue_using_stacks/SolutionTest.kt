package site.lvkun.leetcode.implement_queue_using_stacks

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMyQueue() {
        val queue = MyQueue()

        queue.push(1);
        queue.push(2);
        Assert.assertEquals(1, queue.peek())
        Assert.assertEquals(1, queue.pop())
        Assert.assertFalse(queue.empty())
    }
}