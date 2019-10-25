package site.lvkun.leetcode.sqrtx

class Solution {
    fun mySqrt(x: Int): Int {
        var start = 0
        var end = x

        if (x == 1) {
            return 1
        }

        while (start < end - 1) {
            val y = (start + end) / 2

            if (x / y == y) {
                return y
            }

            if (x / y < y) {
                end = y
            } else {
                start = y
            }
        }

        return start
    }
}