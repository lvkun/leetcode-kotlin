package site.lvkun.leetcode.maximum_product_subarray

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMaxProduct() {
        val solution = Solution()
        Assert.assertEquals(6, solution.maxProduct(intArrayOf(2,3,-2,4)))
        Assert.assertEquals(0, solution.maxProduct(intArrayOf(-2,0,-1)))
    }
}