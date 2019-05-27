package site.lvkun.leetcode.length_of_last_word

class Solution {
    fun lengthOfLastWord(s: String): Int {
        var length = 0
        var lastLength = 0
        for (c in s) {
            if (c.isWhitespace()) {
                if (length != 0) {
                    lastLength = length
                }
                length = 0
            } else {
                length++
            }
        }

        return if (length == 0) lastLength else length
    }
}