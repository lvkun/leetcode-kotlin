package site.lvkun.leetcode.product_of_array_except_self

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testProductExceptSelf() {
        val solution = Solution()
        Assert.assertArrayEquals(intArrayOf(24,12,8,6),
                solution.productExceptSelf(intArrayOf(1,2,3,4)))
    }
}