package site.lvkun.leetcode.minimum_path_sum

class Solution {
    fun minPathSum(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size

        for (i in 1 until m) {
            grid[i][0] += grid[i - 1][0]
        }

        for (j in 1 until n) {
            grid[0][j] += grid[0][j - 1]
        }

        for (i in 1 until m) {
            for (j in 1 until n) {
                grid[i][j] += minOf(grid[i - 1][j], grid[i][j -1])
            }
        }

        return grid[m - 1][n - 1]
    }
}