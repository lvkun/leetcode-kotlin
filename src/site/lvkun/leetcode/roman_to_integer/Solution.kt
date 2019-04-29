package site.lvkun.leetcode.roman_to_integer

class Solution {
    val map = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
        )

    fun romanToInt(s: String): Int {
        var ret = 0

        for (i in s.indices) {
            if (i == s.length - 1 || map.getValue(s[i]) >= map.getValue(s[i + 1])) {
                ret += map.getValue(s[i])
            } else {
                ret -= map.getValue(s[i])
            }
        }

        return ret
    }
}