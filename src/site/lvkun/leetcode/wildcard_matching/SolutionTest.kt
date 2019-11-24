package site.lvkun.leetcode.wildcard_matching

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testIsMatch() {
        val solution = Solution()
        Assert.assertFalse(solution.isMatch("aa", "a"))
        Assert.assertTrue(solution.isMatch("aa", "*"))
        Assert.assertFalse(solution.isMatch("cb", "?a"))
        Assert.assertTrue(solution.isMatch("adceb", "*a*b"))
        Assert.assertFalse(solution.isMatch("acdcb", "a*c?b"))

        // aa
        // a

        // aa
        // *

        // cb
        // ?a

    }
}