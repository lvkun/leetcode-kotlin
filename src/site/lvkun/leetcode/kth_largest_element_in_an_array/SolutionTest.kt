package site.lvkun.leetcode.kth_largest_element_in_an_array

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testFindKthLargest() {
        val solution = Solution()
        Assert.assertEquals(5, solution.findKthLargest(intArrayOf(3,2,1,5,6,4), 2))
        Assert.assertEquals(4, solution.findKthLargest(intArrayOf(3,2,3,1,2,4,5,5,6), 4))
        Assert.assertEquals(2, solution.findKthLargest(intArrayOf(-1,2,0), 1))
    }
}