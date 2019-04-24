package site.lvkun.leetcode.zigzag_conversion

class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows <= 1) {
            return s
        }

        var result = ArrayList<Char>()
        for (row in 0 until numRows) {
            var interval = 2 * numRows - 2
            if (row == 0 || row == numRows - 1) {
                var i = row
                while (i < s.length) {
                    result.add(s[i])
                    i += interval
                }
            } else {
                var i = row
                var j = interval - row
                while (j < s.length) {
                    result.add(s[i])
                    result.add(s[j])

                    i += interval
                    j += interval
                }

                if (i < s.length) {
                    result.add(s[i])
                }

            }
        }

        return result.joinToString("")
    }
}