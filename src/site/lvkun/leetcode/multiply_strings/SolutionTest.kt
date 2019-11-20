package site.lvkun.leetcode.multiply_strings

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun test() {
        val solution = Solution()
//        Assert.assertEquals("6", solution.multiply("2", "3"))
//        Assert.assertEquals("264", solution.multiply("12", "22"))
        Assert.assertEquals("56088", solution.multiply("123", "456"))
        Assert.assertEquals("0", solution.multiply("9133", "0"))
    }
}