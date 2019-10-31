package site.lvkun.leetcode.convert_sorted_array_to_binary_search_tree

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testSortedArrayToBST() {
        val solution = Solution()
        val result = solution.sortedArrayToBST(intArrayOf(-10,-3,0,5,9))
        Assert.assertEquals("[0,-3,9,-10,null,5]", result.toString())
    }
}