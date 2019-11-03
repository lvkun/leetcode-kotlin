package site.lvkun.leetcode.majority_element

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMajorityElement() {
        val solution = Solution()
        Assert.assertEquals(3, solution.majorityElement(intArrayOf(3, 2, 3)))
        Assert.assertEquals(2, solution.majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
    }
}