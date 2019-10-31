package site.lvkun.leetcode.convert_sorted_array_to_binary_search_tree

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return sortedArrayToBST(nums, 0, nums.size)
    }

    private fun sortedArrayToBST(nums: IntArray, start: Int, end: Int): TreeNode? {
        if (start >= end) {
            return null
        }

        if (start + 1 == end) {
            return TreeNode(nums[start])
        }

        val mid = (start + end) / 2

        val result = TreeNode(nums[mid])
        result.left = sortedArrayToBST(nums, start, mid)
        result.right = sortedArrayToBST(nums, mid + 1, end)
        return result
    }
}