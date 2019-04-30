package site.lvkun.leetcode.remove_duplicates_from_sorted_array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size <= 1) {
            return nums.size
        }

        var cur = 0
        var pos = 1

        while (pos < nums.size) {
            if (nums[cur] != nums[pos]) {
                nums[cur + 1] = nums[pos]
                cur++
            }
            pos++
        }

        return cur + 1
    }
}