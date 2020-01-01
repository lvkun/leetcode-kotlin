package site.lvkun.leetcode.search_a_2d_matrix_ii

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val m = matrix.size
        if (m == 0) {
            return false
        }

        val n = matrix[0].size
        if (n == 0) {
            return false
        }

        return searchMatrix(matrix, target, Pair(0, 0), Pair(m - 1, n - 1))
    }

    fun Array<IntArray>.at(pos: Pair<Int, Int>): Int {
        return this[pos.first][pos.second]
    }

    fun searchMatrix(matrix: Array<IntArray>, target: Int, leftTop: Pair<Int, Int>, rightBottom: Pair<Int, Int>): Boolean {
        if (target < matrix.at(leftTop) || target > matrix.at(rightBottom)) {
            return false
        }

        if (rightBottom.first - leftTop.first <= 1 && rightBottom.second - leftTop.second <= 1) {
            for (i in leftTop.first..rightBottom.first) {
                for (j in leftTop.second..rightBottom.second) {
                    if (matrix[i][j] == target) {
                        return true
                    }
                }
            }

            return false
        }

        val midRow = (leftTop.first + rightBottom.first) / 2
        val midCol = (leftTop.second + rightBottom.second) / 2

        return searchMatrix(matrix, target, leftTop, Pair(midRow, midCol)) ||
                searchMatrix(matrix, target, Pair(leftTop.first, midCol), Pair(midRow, rightBottom.second)) ||
                searchMatrix(matrix, target, Pair(midRow, leftTop.second), Pair(rightBottom.first, midCol)) ||
                searchMatrix(matrix, target, Pair(midRow, midCol), rightBottom)
    }
}