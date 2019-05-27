package site.lvkun.leetcode.count_and_say

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testCountAndSay() {
        val solution = Solution()
        Assert.assertEquals("1", solution.countAndSay(1))
        Assert.assertEquals("11", solution.countAndSay(2))
        Assert.assertEquals("21", solution.countAndSay(3))
        Assert.assertEquals("1211", solution.countAndSay(4))
        Assert.assertEquals("111221", solution.countAndSay(5))
    }
}