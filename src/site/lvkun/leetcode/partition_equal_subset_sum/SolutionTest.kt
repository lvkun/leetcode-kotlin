package site.lvkun.leetcode.partition_equal_subset_sum

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testCanPartition() {
        val solution = Solution()
        Assert.assertTrue(solution.canPartition(intArrayOf(1, 5, 11, 5)))
        Assert.assertFalse(solution.canPartition(intArrayOf(1, 2, 3, 5)))
    }
}