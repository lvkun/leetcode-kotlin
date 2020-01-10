package site.lvkun.leetcode.powx_n

class Solution {
    fun myPow(x: Double, n: Int): Double {
        val n = n.toLong()
        if (n < 0) {
            return powInternal(1 / x, -n)
        }
        return powInternal(x, n)
    }

    private fun powInternal(x: Double, n: Long): Double {
        var n = n
        var x = x
        var result = 1.0

        while (n >= 1) {
            if (n % 2 == 1L) {
                n = n - 1
                result *= x
            } else {
                n = n / 2
                x = x * x
            }
        }

        return result
    }
}