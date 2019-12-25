package site.lvkun.leetcode.trapping_rain_water

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testTrap() {
        val solution = Solution()
        Assert.assertEquals(6, solution.trap(intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1)))
    }
}

