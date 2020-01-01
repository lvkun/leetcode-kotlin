package site.lvkun.leetcode.sliding_window_maximum

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMaxSlidingWindow() {
        val solution = Solution()
        Assert.assertArrayEquals(intArrayOf(3,3,5,5,6,7),
                solution.maxSlidingWindow(intArrayOf(1,3,-1,-3,5,3,6,7), 3))
        Assert.assertArrayEquals(intArrayOf(),
                solution.maxSlidingWindow(intArrayOf(), 0))
        Assert.assertArrayEquals(intArrayOf(1, -1),
                solution.maxSlidingWindow(intArrayOf(1, -1), 1))
        Assert.assertArrayEquals(intArrayOf(3,3,2,5),
                solution.maxSlidingWindow(intArrayOf(1,3,1,2,0,5), 3))
    }
}