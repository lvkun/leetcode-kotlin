package site.lvkun.leetcode.single_number

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testSingleNumber() {
        val solution = Solution()
        Assert.assertEquals(1, solution.singleNumber(intArrayOf(2, 2, 1)))
        Assert.assertEquals(4, solution.singleNumber(intArrayOf(4, 1, 2, 1, 2)))
    }
}