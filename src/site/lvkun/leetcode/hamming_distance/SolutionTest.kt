package site.lvkun.leetcode.hamming_distance

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testHammingDistance() {
        val solution = Solution()
        Assert.assertEquals(2, solution.hammingDistance(1, 4))
    }
}