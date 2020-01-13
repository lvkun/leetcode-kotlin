package site.lvkun.leetcode.valid_palindrome_ii

class Solution {
    fun validPalindrome(s: String): Boolean {
        var start = 0
        var end = s.lastIndex

        while (start <= end) {
            if (s[start] == s[end]) {
                start++
                end--
            } else {
                return validPalindromeNoRemove(s, IntRange(start, end - 1)) ||
                        validPalindromeNoRemove(s, IntRange(start + 1, end))
            }
        }

        return true
    }

    private fun validPalindromeNoRemove(s: String, range: IntRange): Boolean {
        var start = range.first
        var end = range.last

        while (start <= end) {
            if (s[start] != s[end]) {
                return false
            }

            start++
            end--
        }

        return true
    }
}