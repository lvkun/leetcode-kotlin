package site.lvkun.leetcode.house_robber

class Solution {
    fun rob(nums: IntArray): Int {
        for (i in 2 until nums.size) {
            nums[i] = nums[i] + maxOf(nums.getOrElse(i - 2) {0}, nums.getOrElse(i - 3) {0})
        }

        return nums.takeLast(2).max() ?: 0
    }

}