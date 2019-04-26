package site.lvkun.leetcode.palindrome_number

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }

        var reverse = 0
        var origin = x
        while (origin > 0) {
            val d = origin % 10
            if (reverse > Integer.MAX_VALUE / 10) {
                return false
            }

            reverse = reverse * 10 + d
            origin /= 10
        }

        return x == reverse
    }
}