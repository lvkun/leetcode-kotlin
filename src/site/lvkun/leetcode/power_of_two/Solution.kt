package site.lvkun.leetcode.power_of_two

class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        if (n < 1) {
            return false
        }

        if (n == 1) {
            return true
        }

        var num = n

        while (num % 2 == 0) {
            num /= 2

            if (num == 1) {
                return true
            }
        }

        return false
    }
}