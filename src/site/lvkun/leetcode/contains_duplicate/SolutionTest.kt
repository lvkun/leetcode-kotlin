package site.lvkun.leetcode.contains_duplicate

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testContainsDuplicate() {
        val solution = Solution()
        Assert.assertTrue(solution.containsDuplicate(intArrayOf(1,2,3,1)))
        Assert.assertFalse(solution.containsDuplicate(intArrayOf(1,2,3,4)))
        Assert.assertTrue(solution.containsDuplicate(intArrayOf(1,1,1,3,3,4,3,2,4,2)))
    }
}