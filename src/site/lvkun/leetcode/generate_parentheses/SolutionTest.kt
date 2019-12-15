package site.lvkun.leetcode.generate_parentheses

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testGenerateParenthesis() {
        val solution = Solution()
        val result = solution.generateParenthesis(3)
        val expected = listOf("((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()")
        Assert.assertEquals(expected.toSet(), result.toSet())
    }
}