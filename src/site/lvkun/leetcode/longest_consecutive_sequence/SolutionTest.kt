package site.lvkun.leetcode.longest_consecutive_sequence

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testLongestConsecutive() {
        val solution = Solution()
        Assert.assertEquals(4, solution.longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2)))
    }
}