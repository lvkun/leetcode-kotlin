package site.lvkun.leetcode.search_in_rotated_sorted_array_ii

class Solution {
    fun search(nums: IntArray, target: Int): Boolean {
        var low = 0
        var high = nums.lastIndex

        while (low < high) {
            val mid = (low + high) / 2

            when {
                nums[mid] == target -> return true
                nums[low] == nums[mid] -> low++
                nums[low] < nums[mid] -> {
                    if (nums[low] <= target && target <= nums[mid]) {
                        high = mid
                    } else {
                        low = mid + 1
                    }
                }
                else -> {
                    if (nums[mid] <= target && target <= nums[high]) {
                        low = mid + 1
                    } else {
                        high = mid
                    }
                }
            }
        }

        return low == high && nums[low] == target
    }
}