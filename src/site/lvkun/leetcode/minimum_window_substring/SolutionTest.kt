package site.lvkun.leetcode.minimum_window_substring

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMinWindow() {
        val solution = Solution()
        Assert.assertEquals("BANC", solution.minWindow("ADOBECODEBANC", "ABC"))
    }
}