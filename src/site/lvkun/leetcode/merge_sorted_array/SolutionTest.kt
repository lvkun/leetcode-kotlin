package site.lvkun.leetcode.merge_sorted_array

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMerge() {
        val solution = Solution()

        val nums1 = intArrayOf(1,2,3,0,0,0)
        val nums2 = intArrayOf(2,5,6)
        solution.merge(nums1, 3, nums2, 3)

        Assert.assertArrayEquals(intArrayOf(1,2,2,3,5,6), nums1)
    }

    @Test
    fun testMergeZero() {
        val solution = Solution()

        val nums1 = intArrayOf(0)
        val nums2 = intArrayOf(1)
        solution.merge(nums1, 0, nums2, 1)

        Assert.assertArrayEquals(intArrayOf(1), nums1)
    }
}