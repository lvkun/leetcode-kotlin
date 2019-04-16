package site.lvkun.leetcode.longest_substring_without_repeating_characters

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }

        val map = HashMap<Char, Int>()
        var length = 1
        var start = 0
        for (i in s.indices) {
            val c = s[i]
            if (map.containsKey(c)) {
                start = Math.max(map[c]!! + 1, start)
            }
            length = Math.max(i - start + 1, length)
            map[c] = i
        }

        return length
    }
}