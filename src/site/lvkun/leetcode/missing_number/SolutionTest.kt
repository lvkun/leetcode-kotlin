package site.lvkun.leetcode.missing_number

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMissingNumber() {
        val solution = Solution()
        Assert.assertEquals(2, solution.missingNumber(intArrayOf(3,0,1)))
        Assert.assertEquals(8, solution.missingNumber(intArrayOf(9,6,4,2,3,5,7,0,1)))
    }
}