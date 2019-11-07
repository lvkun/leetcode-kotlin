package site.lvkun.leetcode.contains_duplicate_ii

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testContainsNearbyDuplicate() {
        val solution = Solution()
        Assert.assertTrue(solution.containsNearbyDuplicate(intArrayOf(1,2,3,1), 3))
        Assert.assertTrue(solution.containsNearbyDuplicate(intArrayOf(1,0,1,1), 1))
        Assert.assertFalse(solution.containsNearbyDuplicate(intArrayOf(1,2,3,1,2,3), 2))
        Assert.assertTrue(solution.containsNearbyDuplicate(intArrayOf(99,99), 2))
    }
}