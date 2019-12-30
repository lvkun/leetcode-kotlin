package site.lvkun.leetcode.number_of_islands

class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        val m = grid.size
        if (m == 0) {
            return 0
        }

        val n = grid[0].size

        var count = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                val v = grid[i][j]
                if (v == '1') {
                    count++
                    mark(grid, i, j)
                }
            }
        }

        return count
    }

    fun mark(grid: Array<CharArray>, row: Int, col: Int) {
        val m = grid.size
        val n = grid[0].size

        if (grid[row][col] != '1') {
            return
        }

        grid[row][col] = 'A'
        if (row > 0) {
            mark(grid, row - 1, col)
        }
        if (row + 1 < m) {
            mark(grid, row + 1, col)
        }

        if (col > 0) {
            mark(grid, row, col - 1)
        }
        if (col + 1 < n) {
            mark(grid, row, col + 1)
        }
    }
}