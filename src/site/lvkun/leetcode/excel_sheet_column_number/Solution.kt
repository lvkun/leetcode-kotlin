package site.lvkun.leetcode.excel_sheet_column_number

class Solution {
    private fun toInt(char: Char) =
            (char - 'A').toInt()

    fun titleToNumber(s: String): Int {
        var result = 0
        for (c in s.toCharArray()) {
            result *= 26
            result += toInt(c) + 1
        }

        return result
    }
}