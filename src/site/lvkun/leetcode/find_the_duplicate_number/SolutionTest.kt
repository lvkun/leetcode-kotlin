package site.lvkun.leetcode.find_the_duplicate_number

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testFindDuplicate() {
        val solution = Solution()
        Assert.assertEquals(2, solution.findDuplicate(intArrayOf(1,3,4,2,2)))
        Assert.assertEquals(3, solution.findDuplicate(intArrayOf(3,1,3,4,2)))
    }
}