package site.lvkun.leetcode.shortest_unsorted_continuous_subarray

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testFindUnsortedSubarray() {
        val solution = Solution()
        Assert.assertEquals(3, solution.findUnsortedSubarray(intArrayOf(1,2,4,5,3)))
        Assert.assertEquals(5, solution.findUnsortedSubarray(intArrayOf(2, 6, 4, 8, 10, 9, 15)))
    }
}