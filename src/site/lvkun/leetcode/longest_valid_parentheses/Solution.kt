package site.lvkun.leetcode.longest_valid_parentheses

/** TODO: REDO */
class Solution {
    fun longestValidParentheses(s: String): Int {
        var left = 0
        var right = 0
        var maxLength = 0

        for (i in 0 .. s.lastIndex) {
            val c = s[i]
            if (c == '(') {
                left++
            } else {
                right++
            }

            if (left == right) {
                maxLength = maxOf(maxLength, 2 * right)
            } else if (right > left) {
                left = 0
                right = 0
            }
        }

        left = 0
        right = 0
        for (i in s.lastIndex downTo 0) {
            val c = s[i]
            if (c == '(') {
                left++
            } else {
                right++
            }

            if (left == right) {
                maxLength = maxOf(maxLength, 2 * right)
            } else if (left > right) {
                left = 0
                right = 0
            }
        }

        return maxLength
    }
}