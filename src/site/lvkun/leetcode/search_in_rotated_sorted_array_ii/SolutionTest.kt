package site.lvkun.leetcode.search_in_rotated_sorted_array_ii

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testSearch() {
        val solution = Solution()
        Assert.assertTrue(solution.search(intArrayOf(2,5,6,0,0,1,2), 0))
        Assert.assertFalse(solution.search(intArrayOf(2,5,6,0,0,1,2), 3))
        Assert.assertTrue(solution.search(intArrayOf(1,3,1,1,1), 3))
        Assert.assertTrue(solution.search(intArrayOf(1,3,1,1,1), 3))
    }
}