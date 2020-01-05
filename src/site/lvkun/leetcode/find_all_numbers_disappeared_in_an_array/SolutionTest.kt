package site.lvkun.leetcode.find_all_numbers_disappeared_in_an_array

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testFindDisappearedNumbers() {
        val solution = Solution()
        Assert.assertEquals(listOf(5,6),
                solution.findDisappearedNumbers(intArrayOf(4,3,2,7,8,2,3,1)))
    }
}