package site.lvkun.leetcode.longest_substring_without_repeating_characters

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testLengthOfLongestSubstring() {
        val solution = Solution()
        var result = solution.lengthOfLongestSubstring("abcabcbb")
        Assert.assertEquals(3, result)

        result = solution.lengthOfLongestSubstring("bbbbb")
        Assert.assertEquals(1, result)

        result = solution.lengthOfLongestSubstring("pwwkew")
        Assert.assertEquals(3, result)

        result = solution.lengthOfLongestSubstring("au")
        Assert.assertEquals(2, result)

        result = solution.lengthOfLongestSubstring("abba")
        Assert.assertEquals(2, result)
    }
}