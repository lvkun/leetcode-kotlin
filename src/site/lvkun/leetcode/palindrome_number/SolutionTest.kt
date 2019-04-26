package site.lvkun.leetcode.palindrome_number

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testIsPalindrome() {
        val solution = Solution()
        Assert.assertTrue(solution.isPalindrome(121))
        Assert.assertFalse(solution.isPalindrome(-121))
        Assert.assertFalse(solution.isPalindrome(10))
    }
}
