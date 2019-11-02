package site.lvkun.leetcode.pascals_triangle

class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        if (numRows <= 0) {
            return emptyList()
        }

        val result = mutableListOf<List<Int>>()

        var lastRow = mutableListOf(1)
        result.add(lastRow)

        for (row in 1 until numRows) {
            val curRow = mutableListOf<Int>()
            for (i in 0..lastRow.size) {
                val item = lastRow.getOrElse(i - 1) {0} + lastRow.getOrElse(i) {0}
                curRow.add(item)
            }

            lastRow = curRow
            result.add(lastRow)
        }

        return result
    }
}