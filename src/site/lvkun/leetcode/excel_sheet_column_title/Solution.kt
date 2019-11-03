package site.lvkun.leetcode.excel_sheet_column_title

class Solution {
    private fun toChar(n: Int): Char {
        return (n + 'A'.toInt()).toChar()
    }

    fun convertToTitle(n: Int): String {
        var result = mutableListOf<Char>()
        var remain = n
        while (remain > 0) {
            remain--
            result.add(toChar(remain % 26))
            remain /= 26
        }
        return result.reversed().joinToString("")
    }
}