package site.lvkun.leetcode.longest_valid_parentheses

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testLongestValidParentheses() {
        val solution = Solution()
        Assert.assertEquals(2, solution.longestValidParentheses("(()"))
        Assert.assertEquals(4, solution.longestValidParentheses(")()())"))
    }
}