package site.lvkun.leetcode.maximal_square

import kotlin.math.min

class Solution {
    fun maximalSquare(matrix: Array<CharArray>): Int {
        val m = matrix.size
        if (m == 0) {
            return 0
        }

        val n = matrix[0].size

        val dp = Array(m) {
            Array(n) {
                Pair(0, 0)
            }
        }

        val length = Array(m) {
            IntArray(n)
        }

        var maxArea = 0
        if (matrix[0][0] == '1') {
            dp[0][0] = Pair(1, 1)
            length[0][0] = 1
            maxArea = 1
        }

        for (row in 1 until m) {
            if (matrix[row][0] == '1') {
                dp[row][0] = Pair(1, 1 + dp[row - 1][0].second)
                length[row][0] = 1
                maxArea = 1
            }
        }

        for (col in 1 until n) {
            if (matrix[0][col] == '1') {
                dp[0][col] = Pair(1 + dp[0][col - 1].first, 1)
                length[0][col] = 1
                maxArea = 1
            }
        }


        for (row in 1 until m) {
            for (col in 1 until n) {
                if (matrix[row][col] == '1') {
                    dp[row][col] = Pair(1 + dp[row][col - 1].first, 1 + dp[row - 1][col].second)
                    length[row][col] = maxOf(1, minOf(length[row - 1][col - 1] + 1, dp[row][col].first, dp[row][col].second))
                    maxArea = maxOf(maxArea, length[row][col] * length[row][col])
                }
            }
        }

        return maxArea
    }
}