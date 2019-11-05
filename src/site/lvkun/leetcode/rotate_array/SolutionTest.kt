package site.lvkun.leetcode.rotate_array

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun test() {
        val solution = Solution()
        var result = intArrayOf(1,2,3,4,5,6,7)
        solution.rotate(result, 3)
        Assert.assertArrayEquals(intArrayOf(5,6,7,1,2,3,4), result)

        result = intArrayOf(-1,-100,3,99)
        solution.rotate(result, 2)
        Assert.assertArrayEquals(intArrayOf(3,99,-1,-100), result)

        result = intArrayOf(1,2)
        solution.rotate(result, 1)
        Assert.assertArrayEquals(intArrayOf(2,1), result)

        result = intArrayOf(1)
        solution.rotate(result, 0)
        Assert.assertArrayEquals(intArrayOf(1), result)

        result = intArrayOf(1)
        solution.rotate(result, 1)
        Assert.assertArrayEquals(intArrayOf(1), result)

        result = intArrayOf(1, 2)
        solution.rotate(result, 2)
        Assert.assertArrayEquals(intArrayOf(1, 2), result)
    }
}