package site.lvkun.leetcode.rotate_image

class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val n = matrix.size
        for (i in 0 until (n + 1) / 2) {
            for (j in 0 until n / 2) {
                val temp = matrix[n - 1 - j][i]
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1]
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i]
                matrix[j][n - 1 - i] = matrix[i][j]
                matrix[i][j] = temp
            }
        }
    }
}