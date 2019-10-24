package site.lvkun.leetcode.maximum_subarray

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMaxSubArray() {
        val solution = Solution()
        Assert.assertEquals(6, solution.maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
        Assert.assertEquals(-1, solution.maxSubArray(intArrayOf(-1)))
    }
}