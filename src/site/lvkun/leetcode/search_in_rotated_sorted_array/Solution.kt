package site.lvkun.leetcode.search_in_rotated_sorted_array

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.lastIndex

        while (low < high) {
            val mid = (low + high) / 2
            if (nums[mid] == target) {
                return mid
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid
                } else {
                    low = mid + 1
                }
            } else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1
                } else {
                    high = mid
                }
            }
        }

        return if (low == high && nums[low] == target) low else -1
    }
}