package site.lvkun.leetcode.task_scheduler

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testLeastInterval() {
        val solution = Solution()
        Assert.assertEquals(8,
                solution.leastInterval(charArrayOf('A','A','A','B','B','B'), 2))
    }
}