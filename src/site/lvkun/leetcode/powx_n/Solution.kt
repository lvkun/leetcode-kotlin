package site.lvkun.leetcode.powx_n

class Solution {
    fun myPow(x: Double, n: Int): Double {
        if (n < 0) {
            return powInternal(1 / x, -n)
        }
        return powInternal(x, n)
    }

    private fun powInternal(x: Double, n: Int): Double {
        var n = n
        var x = x
        var result = 1.0

        while (n >= 1) {
            if (n % 2 == 1) {
                n -= 1
                result *= x
            } else {
                n /= 2
                x *= x
            }
        }

        return result
    }
}