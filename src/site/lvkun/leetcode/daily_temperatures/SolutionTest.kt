package site.lvkun.leetcode.daily_temperatures

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testDailyTemperatures() {
        val solution = Solution()
        Assert.assertArrayEquals(intArrayOf(1, 1, 4, 2, 1, 1, 0, 0),
                solution.dailyTemperatures(intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)))
    }
}