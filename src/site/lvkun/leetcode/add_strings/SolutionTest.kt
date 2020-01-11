package site.lvkun.leetcode.add_strings

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testAddStrings() {
        val solution = Solution()
        Assert.assertEquals("3", solution.addStrings("1", "2"))
        Assert.assertEquals("2", solution.addStrings("", "2"))
        Assert.assertEquals("17", solution.addStrings("9", "8"))
    }
}