package site.lvkun.leetcode.decode_string

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testDecodeString() {
        val solution = Solution()
        Assert.assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"))
        Assert.assertEquals("accaccacc", solution.decodeString("3[a2[c]]"))
        Assert.assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"))
    }
}