package site.lvkun.leetcode.missing_number

class Solution {
    fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        val totalSum = n * (n + 1) / 2
        return totalSum - nums.sum()
    }
}