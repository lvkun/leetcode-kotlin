package site.lvkun.leetcode.coin_change

class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val dp = IntArray(amount + 1)

        for (i in 1..amount) {
            var minChange = Int.MAX_VALUE
            for (coin in coins) {
                if (i >= coin) {
                    minChange = minOf(dp[i - coin], minChange)
                }
            }
            if (minChange != Int.MAX_VALUE) {
                dp[i] = minChange + 1
            } else {
                dp[i] = Int.MAX_VALUE
            }
        }

        if (dp[amount] == Int.MAX_VALUE) {
            return -1
        }

        return dp[amount]
    }
}