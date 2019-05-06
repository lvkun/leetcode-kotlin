package site.lvkun.leetcode.remove_element

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) {
            return 0
        }

        val value = `val`

        var start = 0
        var end = nums.lastIndex

        while (start <= end) {
            if (nums[start] == value) {
                nums[start] = nums[end]
                end--
            } else {
                start++
            }
        }

        return start + 1
    }
}