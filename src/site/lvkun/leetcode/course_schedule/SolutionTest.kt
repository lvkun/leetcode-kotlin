package site.lvkun.leetcode.course_schedule

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testCanFinish() {
        val solution = Solution()
        Assert.assertTrue(solution.canFinish(2, arrayOf(intArrayOf(1, 0))))
        Assert.assertFalse(solution.canFinish(2, arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))))
    }
}