package site.lvkun.leetcode.add_binary

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testAddBinary() {
        val solution = Solution()
        Assert.assertEquals("100", solution.addBinary("11", "1"))
        Assert.assertEquals("10101", solution.addBinary("1010", "1011"))
    }
}