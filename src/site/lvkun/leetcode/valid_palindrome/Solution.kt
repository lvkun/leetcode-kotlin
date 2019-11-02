package site.lvkun.leetcode.valid_palindrome

class Solution {
    fun isPalindrome(s: String): Boolean {
        var start = 0
        var end = s.length - 1

        val arr = s.toCharArray()
        while (start <= end) {
            while (start < s.length && !arr[start].isDigit() && !arr[start].isLetter()) {
                start++
            }
            while (end >= 0 && !arr[end].isDigit() && !arr[end].isLetter()) {
                end--
            }

            if (start == s.length || end == 0) {
                return true
            }

            if (arr[start].toLowerCase() != arr[end].toLowerCase()) {
                return false
            }

            start++
            end--
        }

        return true
    }
}