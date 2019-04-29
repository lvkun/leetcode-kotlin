package site.lvkun.leetcode.longest_common_prefix

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testLongestCommonPrefix() {
        val solution = Solution()
        Assert.assertEquals("fl", solution.longestCommonPrefix(arrayOf("flower","flow","flight")))
        Assert.assertEquals("", solution.longestCommonPrefix(arrayOf("dog","racecar","car")))
        Assert.assertEquals("a", solution.longestCommonPrefix(arrayOf("aa","a")))
    }
}