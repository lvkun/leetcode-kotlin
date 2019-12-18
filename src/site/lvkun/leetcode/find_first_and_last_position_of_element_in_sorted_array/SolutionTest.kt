package site.lvkun.leetcode.find_first_and_last_position_of_element_in_sorted_array

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testSearchRange() {
        val solution = Solution()
        var result = solution.searchRange(intArrayOf(5,7,7,8,8,10), 8)
        Assert.assertArrayEquals(intArrayOf(3,4), result)

        result = solution.searchRange(intArrayOf(5,7,7,8,8,10), 6)
        Assert.assertArrayEquals(intArrayOf(-1,-1), result)
    }
}