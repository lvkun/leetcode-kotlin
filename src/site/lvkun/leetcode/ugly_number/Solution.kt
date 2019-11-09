package site.lvkun.leetcode.ugly_number

class Solution {
    fun isUgly(num: Int): Boolean {
        if (num == 0) {
            return false
        }
        var n = num

        n = divide(n, 2)
        n = divide(n, 3)
        n = divide(n, 5)

        return n == 1
    }

    fun divide(num: Int, d: Int): Int {
        var n = num
        while (n % d == 0) {
            n /= d
        }

        return n
    }
}