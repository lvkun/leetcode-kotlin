package site.lvkun.leetcode.search_insert_position

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        for (i in nums.indices) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.size
    }
}