package site.lvkun.leetcode.powx_n

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMyPow() {
        val solution = Solution()
//        Assert.assertEquals(1024.00000, solution.myPow(2.0, 10), 0.01)
//        Assert.assertEquals(9.26100, solution.myPow(2.10000, 3), 0.01)
        Assert.assertEquals(0.25000, solution.myPow(2.00000, -2), 0.01)
    }
}