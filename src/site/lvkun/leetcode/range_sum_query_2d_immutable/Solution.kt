package site.lvkun.leetcode.range_sum_query_2d_immutable

class NumMatrix(matrix: Array<IntArray>) {
    private var row = 0
    private var col = 0
    private lateinit var sumLeftTop: Array<IntArray>

    fun Array<IntArray>.at(r: Int, c: Int): Int {
        if (r in this.indices && c in this[r].indices) {
            return this[r][c]
        }

        return 0
    }

    init {
        if (matrix.isNotEmpty() && matrix[0].isNotEmpty()) {
            row = matrix.size
            col = matrix[0].size

            sumLeftTop = zeroMatrix(row, col)

            for (r in 0 until row) {
                for (c in 0 until col) {
                    sumLeftTop[r][c] = sumLeftTop.at(r - 1, c) +
                            sumLeftTop.at(r, c - 1) -
                            sumLeftTop.at(r - 1, c - 1) +
                            matrix[r][c]
                }
            }
        }


    }

    private fun zeroMatrix(row: Int, col: Int) =
            Array<IntArray>(row) { IntArray(col) }

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        if (row == 0 || col == 0) {
            return 0
        }

        return sumLeftTop.at(row2, col2) -
                sumLeftTop.at(row1 - 1, col2) -
                sumLeftTop.at(row2, col1 - 1) +
                sumLeftTop.at(row1 - 1, col1 - 1)
    }
}
