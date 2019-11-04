package site.lvkun.leetcode.factorial_trailing_zeroes

class Solution {
    fun trailingZeroes(n: Int): Int {
        var result = 0
        var num = n

        while (num >= 5) {
            result += num / 5
            num /= 5
        }

        return result
    }
}