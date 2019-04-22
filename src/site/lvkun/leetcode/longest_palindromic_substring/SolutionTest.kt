package site.lvkun.leetcode.longest_palindromic_substring

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testLongestPalindrome() {
        val solution = Solution()
        var result = solution.longestPalindrome("babad")
        Assert.assertEquals("bab", result)

        result = solution.longestPalindrome("cbbd")
        Assert.assertEquals("bb", result)
    }
}