package site.lvkun.leetcode.subarray_sum_equals_k

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testSubarraySum() {
        val solution = Solution()
        Assert.assertEquals(2, solution.subarraySum(intArrayOf(1,1,1), 2))
    }
}