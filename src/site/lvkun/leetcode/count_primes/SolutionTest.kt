package site.lvkun.leetcode.count_primes

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testCountPrimes() {
        val solution = Solution()
        Assert.assertEquals(4, solution.countPrimes(10))
        Assert.assertEquals(0, solution.countPrimes(0))
        Assert.assertEquals(1, solution.countPrimes(3))
        Assert.assertEquals(2, solution.countPrimes(5))
    }
}