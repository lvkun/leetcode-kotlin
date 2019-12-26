package site.lvkun.leetcode.subsets

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testSubsets() {
        val solution = Solution()
        val result = solution.subsets(intArrayOf(1,2,3))
        val expected = listOf(
                listOf(3),
                listOf(1),
                listOf(2),
                listOf(1,2,3),
                listOf(1,3),
                listOf(2,3),
                listOf(1,2),
                listOf()
        )

        Assert.assertEquals(expected.toSet(), result.toSet())
    }
}