package site.lvkun.leetcode.valid_palindrome_ii

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testValidPalindrome() {
        val solution = Solution()
        Assert.assertTrue(solution.validPalindrome("aba"))
        Assert.assertTrue(solution.validPalindrome("abca"))
    }
}