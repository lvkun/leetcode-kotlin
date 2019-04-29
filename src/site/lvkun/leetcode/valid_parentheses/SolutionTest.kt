package site.lvkun.leetcode.valid_parentheses

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testIsValid() {
        val solution = Solution()
        Assert.assertTrue(solution.isValid("()"))
        Assert.assertTrue(solution.isValid("()[]{}"))
        Assert.assertFalse(solution.isValid("(]"))
        Assert.assertFalse(solution.isValid("([)]"))
        Assert.assertTrue(solution.isValid("{[]}"))
    }
}