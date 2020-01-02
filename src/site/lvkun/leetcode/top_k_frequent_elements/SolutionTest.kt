package site.lvkun.leetcode.top_k_frequent_elements

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testTopKFrequent() {
        val solution = Solution()
        Assert.assertEquals(listOf(1,2), solution.topKFrequent(intArrayOf(1,1,1,2,2,3), 2))
        Assert.assertEquals(listOf(1), solution.topKFrequent(intArrayOf(1), 1))
    }
}