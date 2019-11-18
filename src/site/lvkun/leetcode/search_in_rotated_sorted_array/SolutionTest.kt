package site.lvkun.leetcode.search_in_rotated_sorted_array

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testSearch() {
        val solution = Solution()
        Assert.assertEquals(4, solution.search(intArrayOf(4,5,6,7,0,1,2), 0))
        Assert.assertEquals(-1, solution.search(intArrayOf(4,5,6,7,0,1,2), 3))
    }
}