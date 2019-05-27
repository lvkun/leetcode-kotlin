package site.lvkun.leetcode.length_of_last_word

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testLengthOfLastWord() {
        val solution = Solution()
        Assert.assertEquals(5, solution.lengthOfLastWord("Hello World"))
        Assert.assertEquals(5, solution.lengthOfLastWord("Hello"))
        Assert.assertEquals(1, solution.lengthOfLastWord("a"))
        Assert.assertEquals(1, solution.lengthOfLastWord("a "))
        Assert.assertEquals(1, solution.lengthOfLastWord("b   a   "))
    }
}