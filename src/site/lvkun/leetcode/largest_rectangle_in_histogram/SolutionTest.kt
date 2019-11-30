package site.lvkun.leetcode.largest_rectangle_in_histogram

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testLargestRectangleArea() {
        val solution = Solution()
        Assert.assertEquals(10, solution.largestRectangleArea(intArrayOf(2,1,5,6,2,3)))
    }
}