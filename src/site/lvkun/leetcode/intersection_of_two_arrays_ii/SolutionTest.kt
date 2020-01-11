package site.lvkun.leetcode.intersection_of_two_arrays_ii

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testIntersect() {
        val solution = Solution()
        Assert.assertEquals(intArrayOf(2, 2).sorted(),
                solution.intersect(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).sorted())
        Assert.assertEquals(intArrayOf(4, 9).sorted(),
                solution.intersect(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)).sorted())
    }
}