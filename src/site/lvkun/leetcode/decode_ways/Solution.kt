package site.lvkun.leetcode.decode_ways

class Solution {
    fun numDecodings(s: String): Int {
        if (s.isEmpty() || s[0] == '0') {
            return 0
        }

        val dp = IntArray(s.length + 1)
        dp[0] = 1
        for (i in 1 .. dp.lastIndex) {
            if (s[i - 1] != '0') {
                dp[i] += dp[i - 1]
            }

            if (i >= 2 && (s[i - 2] == '1' || s[i - 2] == '2' && s[i - 1] <= '6')) {
                dp[i] += dp[i - 2]
            }
        }

        return dp.last()
    }
}