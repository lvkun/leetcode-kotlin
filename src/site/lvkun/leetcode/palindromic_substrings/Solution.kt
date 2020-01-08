package site.lvkun.leetcode.palindromic_substrings

class Solution {
    fun countSubstrings(s: String): Int {
        val dp = Array(s.length) {
            BooleanArray(s.length)
        }

        var count = 0
        for (i in s.indices) {
            dp[i][i] = true
            count++
        }

        for (length in 1 until s.length) {
            for (i in s.indices) {
                val j = length + i
                if (j < s.length) {
                    dp[i][j] = s[i] == s[j] && (if (length > 1) {
                        dp[i + 1][j - 1]
                    } else true)

                    if (dp[i][j]) {
                        count++
                    }
                }
            }
        }

        return count
    }
}