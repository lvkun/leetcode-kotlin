package site.lvkun.leetcode.next_permutation

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testNextPermutation() {
        val solution = Solution()
//        var result = intArrayOf(1,2,3)
//        solution.nextPermutation(result)
//        Assert.assertArrayEquals(intArrayOf(1,3,2), result)
//
//        result = intArrayOf(3,2,1)
//        solution.nextPermutation(result)
//        Assert.assertArrayEquals(intArrayOf(1,2,3), result)
//
//        result = intArrayOf(1,1,5)
//        solution.nextPermutation(result)
//        Assert.assertArrayEquals(intArrayOf(1,5,1), result)
//
//        result = intArrayOf(1,2)
//        solution.nextPermutation(result)
//        Assert.assertArrayEquals(intArrayOf(2,1), result)

        val result = intArrayOf(1,5,1)
        solution.nextPermutation(result)
        Assert.assertArrayEquals(intArrayOf(5,1,1), result)
    }
}