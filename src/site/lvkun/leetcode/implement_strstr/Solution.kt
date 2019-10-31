package site.lvkun.leetcode.implement_strstr

class Solution {
    private fun nextOf(needle: String): IntArray {
        val next = IntArray(needle.length)

        var n = 0
        for (i in 1 until needle.length) {
            while (n > 0 && needle[n] != needle[i]) {
                n = next[n - 1]
            }

            if (needle[n] == needle[i]) {
                n++
            }
            next[i] = n
        }

        return next
    }

    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) {
            return 0
        }

        val next = nextOf(needle)
        var n = 0
        for (i in 0 until haystack.length) {
            while (n > 0 && haystack[i] != needle[n]) {
                n = next[n - 1]
            }
            if (haystack[i] == needle[n]) {
                n++
            }
            if (n == needle.length) {
                return i - n + 1
            }
        }

        return -1
    }
}