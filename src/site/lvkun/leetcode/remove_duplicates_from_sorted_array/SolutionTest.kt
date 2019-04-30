package site.lvkun.leetcode.remove_duplicates_from_sorted_array

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testRemoveDuplicates() {
        val solution = Solution()
        var nums = intArrayOf(1,1,2)
        var length = solution.removeDuplicates(nums)
        var result = nums.sliceArray(0 until length)
        Assert.assertArrayEquals(intArrayOf(1,2), result)

        nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        length = solution.removeDuplicates(nums)
        result = nums.sliceArray(0 until length)
        Assert.assertArrayEquals(intArrayOf(0,1,2,3,4), result)
    }
}