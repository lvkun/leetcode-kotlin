package site.lvkun.leetcode.contains_duplicate_ii

class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        if (k == 0) {
            return false
        }

        val set = mutableSetOf<Int>()
        for (i in 0 until minOf(k, nums.size)) {
            if (set.contains(nums[i])) {
                return true
            }
            set.add(nums[i])
        }

        if (k >= nums.size) {
            return false
        }

        for (i in k until nums.size) {
            if (set.contains(nums[i])) {
                return true
            }

            set.remove(nums[i - k])
            set.add(nums[i])
        }
        return false
    }
}