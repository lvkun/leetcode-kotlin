package site.lvkun.leetcode.longest_palindromic_substring

class Solution {
    data class Range(var start: Int, var end: Int)

    private fun Range.palidrome(s: String): Boolean {
        return (start >= 0 && end < s.length && s[start] == s[end])
    }

    private fun Range.extend(): Range {
        return Range(start - 1, end + 1)
    }

    private fun max(r1: Range, r2: Range): Range {
        if (r1.length() > r2.length()) {
            return r1
        }

        return r2
    }

    private fun Range.length(): Int {
        return end - start + 1
    }

    private fun String.substring(r: Range): String {
        return substring(r.start, r.end + 1)
    }

    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) {
            return s
        }

        var result = Range(0, 0)

        for (i in s.indices) {
            // center at i
            var cur = Range(i, i)
            var extend = cur.extend()
            while(extend.palidrome(s)) {
                cur = extend
                extend = extend.extend()
            }

            result = max(cur, result)

            extend = Range(i, i + 1)
            while (extend.palidrome(s)) {
                cur = extend
                extend = extend.extend()
            }
            result = max(cur, result)
        }
        return s.substring(result)
    }
}