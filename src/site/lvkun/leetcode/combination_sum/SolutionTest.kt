package site.lvkun.leetcode.combination_sum

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testCombinationSum() {
        val solution = Solution()
        var result = solution.combinationSum(intArrayOf(2,3,6,7), 7)
        Assert.assertEquals(listOf(
                listOf(7),
                listOf(2,2,3)
        ).toSet(), result.toSet())

        result = solution.combinationSum(intArrayOf(2,3,5), 8)
        Assert.assertEquals(listOf(
                listOf(2,2,2,2),
                listOf(2,3,3),
                listOf(3,5)
        ).toSet(), result.toSet())
    }
}