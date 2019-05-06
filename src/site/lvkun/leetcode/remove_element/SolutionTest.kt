package site.lvkun.leetcode.remove_element

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testRemoveElement() {
        val solution = Solution()
        var nums = intArrayOf(3,2,2,3)
        var length = solution.removeElement(nums, 3)
        var result = nums.sliceArray(0 until length)
        Assert.assertArrayEquals(intArrayOf(2,2), result)

        nums = intArrayOf(0,1,2,2,3,0,4,2)
        length = solution.removeElement(nums, 2)
        result = nums.sliceArray(0 until length)
        Assert.assertArrayEquals(intArrayOf(0,1,4,0,3), result)

        nums = intArrayOf(1)
        length = solution.removeElement(nums, 1)
        Assert.assertEquals(0, length)
    }
}