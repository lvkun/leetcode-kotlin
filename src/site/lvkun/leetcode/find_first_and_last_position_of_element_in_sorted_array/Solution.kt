package site.lvkun.leetcode.find_first_and_last_position_of_element_in_sorted_array

class Solution {
    private fun searchBoundary(nums: IntArray, target: Int, left: Boolean): Int {
        var low = 0
        var high = nums.size

        while (low < high) {
            val mid = (low + high) / 2
            when {
                nums[mid] == target -> {
                    if (left) {
                        high = mid
                    } else {
                        low = mid + 1
                    }
                }
                nums[mid] < target -> {
                    low = mid + 1
                }
                nums[mid] > target -> {
                    high = mid
                }
            }
        }

        return low
    }

    fun searchRange(nums: IntArray, target: Int): IntArray {
        val targetRange = intArrayOf(-1, -1)

        val left = searchBoundary(nums, target, true)
        if (left == nums.size || nums[left] != target) {
            return targetRange
        }

        val right = searchBoundary(nums, target, false) - 1

        targetRange[0] = left
        targetRange[1] = right

        return targetRange
    }
}