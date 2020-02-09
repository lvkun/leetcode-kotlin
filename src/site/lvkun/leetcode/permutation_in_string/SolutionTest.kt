package site.lvkun.leetcode.permutation_in_string

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testCheckInclusion() {
        val solution = Solution()
        Assert.assertTrue(solution.checkInclusion("ab", "eidbaooo"))
        Assert.assertFalse(solution.checkInclusion("ab", "eidboaoo"))
    }
}