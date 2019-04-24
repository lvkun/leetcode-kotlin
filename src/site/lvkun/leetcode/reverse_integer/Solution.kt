package site.lvkun.leetcode.reverse_integer

class Solution {
    fun reverse(x: Int): Int {
        var r = 0
        var n = x
        while (n != 0) {
            if (Math.abs(r) > Integer.MAX_VALUE / 10) {
                return 0
            }

            r = 10 * r + n % 10
            n /= 10
        }

        return r
    }
}