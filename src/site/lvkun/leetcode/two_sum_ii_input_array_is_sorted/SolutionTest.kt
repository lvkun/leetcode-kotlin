package site.lvkun.leetcode.two_sum_ii_input_array_is_sorted

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testTwoSum() {
        val solution = Solution()
        Assert.assertArrayEquals(intArrayOf(1, 2), solution.twoSum(intArrayOf(2, 7, 11, 15), 9))
        Assert.assertArrayEquals(intArrayOf(1, 3), solution.twoSum(intArrayOf(2, 3, 4), 6))
    }
}