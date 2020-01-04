package site.lvkun.leetcode.evaluate_division

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testCalcEquation() {
        val solution = Solution()
        val result = solution.calcEquation(
                listOf(listOf("a", "b"), listOf("b", "c")),
                doubleArrayOf(2.0, 3.0),
                listOf(listOf("a", "c"),
                        listOf("b", "a"),
                        listOf("a", "e"),
                        listOf("a", "a"),
                        listOf("x", "x")))
        Assert.assertArrayEquals(doubleArrayOf(6.0, 0.5, -1.0, 1.0, -1.0), result, 0.01)
    }
}