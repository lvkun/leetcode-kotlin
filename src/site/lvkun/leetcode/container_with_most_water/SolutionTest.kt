package site.lvkun.leetcode.container_with_most_water

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMaxArea() {
        val solution = Solution()
        Assert.assertEquals(49, solution.maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)))
    }
}