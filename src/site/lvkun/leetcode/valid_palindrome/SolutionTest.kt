package site.lvkun.leetcode.valid_palindrome

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testIsPalindrome() {
        val solution = Solution()
//        Assert.assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"))
        Assert.assertFalse(solution.isPalindrome("race a car"))
    }
}