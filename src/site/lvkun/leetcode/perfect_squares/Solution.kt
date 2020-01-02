package site.lvkun.leetcode.perfect_squares

class Solution {
    fun numSquares(n: Int): Int {
        val dp = IntArray(n + 1)

        for (i in 0..n) {
            dp[i] = i
        }

        for (i in 1..n) {
            var j = 1
            while (i - j * j >= 0) {
                dp[i] = minOf(dp[i], dp[i - j * j] + 1)
                j++
            }
        }

        return dp[n]
    }
}