package site.lvkun.leetcode.longest_increasing_subsequence

/** TODO: REDO */
class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }

        val dp = IntArray(nums.size) { 1 }

        var maxLength = 1
        for (i in nums.indices) {
            var curMax = 0
            for (j in 0 until i) {
                if (nums[i] > nums[j]) {
                    curMax = maxOf(dp[j], curMax)
                }
            }

            dp[i] = curMax + 1
            maxLength = maxOf(maxLength, dp[i])
        }

        return maxLength
    }
}