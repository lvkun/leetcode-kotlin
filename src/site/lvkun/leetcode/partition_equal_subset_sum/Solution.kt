package site.lvkun.leetcode.partition_equal_subset_sum

/** TODO: REDO */
class Solution {
    fun canPartition(nums: IntArray): Boolean {
        val s = nums.sum()
        if (s % 2 != 0) {
            return false
        }

        val target = s / 2

        val dp = Array<BooleanArray>(nums.size) {
            BooleanArray(target + 1)
        }

        dp[0][0] = true
        if (nums[0] < target) {
            dp[0][nums[0]] = true
        }

        for (i in 1..nums.lastIndex) {
            for (j in 0..target) {
                if (nums[i] == j) {
                    dp[i][j] = true
                    continue
                }

                dp[i][j] = dp[i - 1][j] || (nums[i] < j) && dp[i - 1][j - nums[i]]
            }
        }

        return dp[nums.lastIndex][target]
    }
}