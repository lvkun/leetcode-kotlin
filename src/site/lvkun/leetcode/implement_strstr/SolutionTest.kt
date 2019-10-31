package site.lvkun.leetcode.implement_strstr

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testStrStr() {
        val solution = Solution()
        Assert.assertEquals(2, solution.strStr("hello", "ll"))
        Assert.assertEquals(-1, solution.strStr("aaaaa", "bba"))
        Assert.assertEquals(0, solution.strStr("a", ""))
    }
}