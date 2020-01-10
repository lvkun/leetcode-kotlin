package site.lvkun.leetcode.divide_two_integers

class Solution {
    fun Int.abs(): Long {
        val r = this.toLong()
        return if (r > 0) {
            r
        } else {
            -r
        }
    }

    fun divide(dividend: Int, divisor: Int): Int {
        when (divisor) {
            0 -> return 0
            1 -> return dividend
            -1 -> return if (dividend > Int.MIN_VALUE) {
                -dividend
            } else {
                Int.MAX_VALUE
            }
        }

        val positive = !(dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0)

        val result = divideInternal(dividend.abs(), divisor.abs())

        return if (positive) {
            result
        } else {
            -result
        }
    }

    fun divideInternal(dividend: Long, divisor: Long): Int {
        if (dividend < divisor) {
            return 0
        }

        var count = 1
        var sum = divisor
        var next = sum.shl(1)
        while (next < dividend) {
            sum = next
            next = sum.shl(1)
            count = count.shl(1)
        }

        return count + divideInternal(dividend - sum, divisor)
    }
}