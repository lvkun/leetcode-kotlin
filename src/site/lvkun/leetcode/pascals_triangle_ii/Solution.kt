package site.lvkun.leetcode.pascals_triangle_ii

class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        if (rowIndex < 0) {
            return emptyList()
        }

        val result = IntArray(rowIndex + 1) { 0 }
        result[0] = 1
        for (row in 1..rowIndex) {
            var lastItem = 0
            for (col in 0..row) {
                val temp = result[col]
                result[col] = result[col] + lastItem
                lastItem = temp
            }
        }

        return result.toList()
    }
}