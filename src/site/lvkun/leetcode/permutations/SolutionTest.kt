package site.lvkun.leetcode.permutations

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testPermute() {
        val solution = Solution()
        val result = solution.permute(intArrayOf(1,2,3))
        val expected = listOf(
                listOf(1,2,3),
                listOf(1,3,2),
                listOf(2,1,3),
                listOf(2,3,1),
                listOf(3,1,2),
                listOf(3,2,1)
        )
        Assert.assertEquals(expected.toSet(), result.toSet())
    }
}