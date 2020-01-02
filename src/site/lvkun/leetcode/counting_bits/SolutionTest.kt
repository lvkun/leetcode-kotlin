package site.lvkun.leetcode.counting_bits

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testCountBits() {
        val solution = Solution()
        Assert.assertArrayEquals(intArrayOf(0,1,1),
                solution.countBits(2))
        Assert.assertArrayEquals(intArrayOf(0,1,1,2,1,2),
                solution.countBits(5))
        Assert.assertArrayEquals(intArrayOf(0),
                solution.countBits(0))
        Assert.assertArrayEquals(intArrayOf(0,1),
                solution.countBits(1))
    }
}