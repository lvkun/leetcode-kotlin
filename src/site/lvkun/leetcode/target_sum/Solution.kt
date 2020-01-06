package site.lvkun.leetcode.target_sum

/** TODO: REDO */
class Solution {
    fun findTargetSumWays(nums: IntArray, S: Int): Int {
        if (S > 1000) {
            return 0
        }

        val dp = Array<IntArray>(nums.size) { IntArray(2001) }

        dp[0][nums[0] + 1000] = 1
        dp[0][-nums[0] + 1000] += 1

        for (i in 1..nums.lastIndex) {
            for (j in -1000..1000) {
                if (dp[i - 1][j + 1000] > 0) {
                    dp[i][j + nums[i] + 1000] += dp[i - 1][j + 1000]
                    dp[i][j - nums[i] + 1000] += dp[i - 1][j + 1000]
                }
            }
        }

        return dp[nums.lastIndex][S + 1000]
    }
}