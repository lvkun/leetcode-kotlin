package site.lvkun.leetcode.longest_increasing_subsequence

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testLengthOfLIS() {
        val solution = Solution()
        Assert.assertEquals(4, solution.lengthOfLIS(intArrayOf(10,9,2,5,3,7,101,18)))
    }
}