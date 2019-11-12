package site.lvkun.leetcode.three_sum

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testThreeSum() {
        val solution = Solution()
        var result = solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
        var expected = listOf(listOf(-1, 0, 1),
                listOf(-1, -1, 2))
        Assert.assertEquals(expected.toSet(), result.toSet())

        result = solution.threeSum(intArrayOf(4,4,3,-5,0,0,0,-2,3,-5,-5,0))
    }
}