package site.lvkun.leetcode.search_insert_position

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testSearchInsert() {
        val solution = Solution()
        Assert.assertEquals(2,
            solution.searchInsert(intArrayOf(1,3,5,6), 5))
        Assert.assertEquals(1,
            solution.searchInsert(intArrayOf(1,3,5,6), 2))
        Assert.assertEquals(4,
            solution.searchInsert(intArrayOf(1,3,5,6), 7))
        Assert.assertEquals(0,
            solution.searchInsert(intArrayOf(1,3,5,6), 0))
    }
}