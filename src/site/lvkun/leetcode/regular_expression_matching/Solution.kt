package site.lvkun.leetcode.regular_expression_matching

/** TODO: redo */
class Solution {
    fun isMatch(s: String, p: String): Boolean {
        val dp = Array(s.length + 1) {
            BooleanArray(p.length + 1)
        }

        dp[s.length][p.length] = true

        for (i in s.length downTo 0) {
            for (j in p.length - 1 downTo 0) {
                val firstMatch = i < s.length &&
                        (p[j] == s[i] || p[j] == '.')

                if (j + 1 < p.length && p[j + 1] == '*') {
                    dp[i][j] = dp[i][j+2] || firstMatch && dp[i + 1][j]
                } else {
                    dp[i][j] = firstMatch && dp[i + 1][j + 1]
                }
            }
        }


        return dp[0][0]
    }
}