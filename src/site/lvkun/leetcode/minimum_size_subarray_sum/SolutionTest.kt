package site.lvkun.leetcode.minimum_size_subarray_sum

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMinSubArrayLen() {
        val solution = Solution()
//        Assert.assertEquals(2, solution.minSubArrayLen(7, intArrayOf(2,3,1,2,4,3)))
        Assert.assertEquals(3, solution.minSubArrayLen(11, intArrayOf(1,2,3,4,5)))
    }
}